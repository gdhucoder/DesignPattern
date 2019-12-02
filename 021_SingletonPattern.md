

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

## 用例

## 实际应用

## 注意

## 参考

Singleton is “one instance per JVM”, so each node will have its own copy of singleton.


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

