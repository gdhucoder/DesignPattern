 
# 享元模式（Flyweight Pattern）

## 定义

享元模式运用共享技术有效地支持大量细粒度的对象。

flyweight design pattern enables use sharing of 
objects to support large numbers of fine-grained objects efficiently. 
A flyweight is a shared object that can be used in multiple contexts 
simultaneously. The flyweight acts as an independent object in each context.

## 类图

![Flyweight](https://gitee.com/gdhu/testtingop/raw/master/2019-12-09_024.jpg)

## 用例

《大话设计模式》中的例子不怎么好，就不放了。

## 实际应用

享元模式可以避免大量相似类的开销。在程序设计时，有时需要生成大量细粒度的类实例来表示数据。
如果能发现这些实例除了几个参数外基本上都是相同的，有时就能够大幅度减少需要实例化的类的熟练。
如果能把那些参数移到实例的外面，在方法调用时将它们传递过来，就可以通过共享大幅度的减少
单个实例的个数。

意思是说：外部状态传递给Flyweight对象。

`java String的实现就是享元模式。`

## 注意

多线程环境下使用Lock。

## 参考
 
[howtodo-flyweight](https://howtodoinjava.com/design-patterns/structural/flyweight-design-pattern/)
 