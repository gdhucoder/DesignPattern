

# 单例模式

## 定义

单例模式讨论的是一个应用中，一个类有且仅有一个实例的情况。
在Java中要讨论的是在每个JVM（java虚拟机）中，仅有一个实例。

注意两个词：**每个JVM**，**一个实例**。

接下来，让我们讨论一下在Java中如何实现单例模式。

## 饿汉模式（Eager Initialization）

不管有没有其他类调用这个实例，单例在系统类加载时就会被创建。

```java
public class EagerSingleton {

  private static volatile EagerSingleton instance = new EagerSingleton();

  public static EagerSingleton getInstance() {
    return instance;
  }

  private EagerSingleton() {
    System.out.printf("%s Instance Created!\n", this.getClass().getSimpleName());
  }
}
```

这种方法仅有一个缺点，对象大时，占用系统资源较多。
如果对象不大，占用系统资源较少，这是一个实现单例的好方法。

## 懒汉模式（Lazy Initialization）

在编程中，延迟初始化是一种编程技巧。在第一次需要时，才创建对象、计算值或者执行其他耗时的过程。

```java
public final class LazySingleton {

  private static volatile LazySingleton instance = null;

  private LazySingleton() {}

  public static LazySingleton getInstance() {
    if(instance==null){
      synchronized (LazySingleton.class){
        instance = new LazySingleton();
      }
    }
    return instance;
  }
}
```

## 静态块初始化 Singleton with static block initialization

这种方法在类加载的时候创建实例。有一个缺点：就是假设这个类里有5个静态变量，代码仅需要访问2-3个变量，这时创建
instance就没有什么用。

```java
public class StaticBlockSingleton {

  private static final StaticBlockSingleton instance;

  static {
    instance = new StaticBlockSingleton();
  }

  private StaticBlockSingleton() {}

  public static StaticBlockSingleton getInstance() {
    return instance;
  }

}
```

## Bill Pugh 单例

LazyHolder类在需要时才创建。同时我们还可以访问其他静态变量。


```java
public class BillPughSingleton {

  public static int NUM = 10;

  private BillPughSingleton() {
    System.out.println("create singleton.");
  }

  private static class LazyHolder {

    static {
      System.out.println("create class LazyHolder...");
    }

    private static final BillPughSingleton instance = new BillPughSingleton();
  }

  public static BillPughSingleton getInstance() {
    return LazyHolder.instance;
  }
}
```

## 单例序列化

反序列化时会重新生成实例。在类中加入`readResolve`方法。返回当前实例。

>This method will be invoked when you will de-serialize the object. Inside of this method, you must return the existing instance to ensure a single instance application wide.

```java
public class DemoSingleton implements Serializable {

  private static volatile DemoSingleton instance = null;

  public static DemoSingleton getInstance() {
    if (instance == null) {
      instance = new DemoSingleton();
    }
    return instance;
  }

  private int i = 10;

  // return existing instance.
//  protected Object readResolve(){
//    return instance;
//  }

  public int getI() {
    return i;
  }

  public void setI(int i) {
    this.i = i;
  }
}
```

## 关于序列号

序列化要加上序列号。若不加，这个了类如果修改的话，再次反序列化此前的类，会报 `local class incompatible`

```java
Exception in thread "main" java.io.InvalidClassException: u021.seri.DemoSingleton; local class incompatible: stream classdesc serialVersionUID = -6928200329713978600, local class serialVersionUID = 2784835485903072265
	at java.base/java.io.ObjectStreamClass.initNonProxy(ObjectStreamClass.java:689)
	at java.base/java.io.ObjectInputStream.readNonProxyDesc(ObjectInputStream.java:1903)
	at java.base/java.io.ObjectInputStream.readClassDesc(ObjectInputStream.java:1772)
	at java.base/java.io.ObjectInputStream.readOrdinaryObject(ObjectInputStream.java:2060)
	at java.base/java.io.ObjectInputStream.readObject0(ObjectInputStream.java:1594)
	at java.base/java.io.ObjectInputStream.readObject(ObjectInputStream.java:430)
	at u021.seri.Client.main(Client.java:21)
```

>This problem can be solved only by adding a unique serial version id to the class. It will prevent the compiler from throwing the exception by telling it that both classes are same, and will load the available instance variables only.

## 总结

经过上面的讨论，那么一个推荐的单例模式该如何写呢？

```java
public class DemoSingleton implements Serializable {

  private static final long serialVersionUID = 1L;

  private DemoSingleton() {}

  private static class DemoSingletonHolder {

    private static final DemoSingleton instance = new DemoSingleton();
  }

  public static DemoSingleton getInstance() {
    return DemoSingletonHolder.instance;
  }

  protected Object readResolve() {
    return getInstance();
  }
}
```

## 参考

[双重检查锁🔒double-checked_locking](https://en.wikipedia.org/wiki/Double-checked_locking)

## 问题

### 分布式系统的单例有几个？

Singleton is “one instance per JVM”, so each node will have its own copy of singleton.


### 关于BillPughSingleton

类初始化在JVM层面是线程安全的。

```java
public class BillPughSingleton {
    private BillPughSingleton() {
    }
  
    private static class LazyHolder {
        private static final BillPughSingleton INSTANCE = new BillPughSingleton();
    }
  
    public static BillPughSingleton getInstance() {
        return LazyHolder.INSTANCE;
    }
}
```

As per you recommend above code template to design singleton class.
But how Thread safety achieve in above code ??

It’s already threadsafe because java static field/class 
initialization is thread safe – at JVM level. 
Static initialization is performed once per class-loader and JVM 
ensures the single copy of static fields. So even if two threads access above code, 
only one instance of class will be created by JVM.

