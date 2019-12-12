
# 简单工厂模式（Simple Factory Method）

## 定义

简单工厂模式根据提供的参数返回某个子类实例。返回的通常是父类的类型，并且有暴露的方法。

Simple Factory Pattern, which software design pattern which 
returns an instance of one of several possible classes depending 
on the type of data provided. It is quite common to 
return a common parent class and common methods, 
but each may perform a task differently or optimise for different data or behaviours.

## 类图

![simple factory](https://gitee.com/gdhu/testtingop/raw/master/2019-12-10_030.jpg)

## 用例

比较简单。《大话设计模式》中讲的是计算器的例子。

[code example](./code/u001)

## 实际应用

- JDK类库中广泛使用了简单工厂模式，如工具类java.text.DateFormat，它用于格式化一个本地日期或者时间。

```java
public final static DateFormat getDateInstance();
public final static DateFormat getDateInstance(int style);
public final static DateFormat getDateInstance(int style,Locale locale);
```

- Java加密技术

获取不同加密算法的密钥生成器:

`KeyGenerator keyGen=KeyGenerator.getInstance("DESede");`

- 创建密码器:

`Cipher cp=Cipher.getInstance("DESede");`

## 注意

简单工厂模式优点在于，当你需要什么，仅仅需要输入一个参数。就可以获得所需的对象，无需知道创建对象的细节。

将对象创建和使用分离。

## 参考

[ref-1](https://design-patterns.readthedocs.io/zh_CN/latest/creational_patterns/simple_factory.html)