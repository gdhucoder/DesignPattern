
# 访问者模式（Visitor Pattern）

## 定义

把数据结构和作用于结构上的操作之间解耦合。简单点说就是数据结构和算法分开。

Allows for one or more operation to be applied to a set of objects at runtime, 
decoupling the operations from the object structure. 

## 类图

![visitor pattern](https://gitee.com/gdhu/testtingop/raw/master/2019-12-10_028.jpg)

## 用例

访问者模式算是比较复杂的。《大话设计模式》中举的男人女人（稳定的数据结构）的例子。

具体请看代码吧：
[code example](./code/u028)

## 实际应用

比较稳定的数据结构，算法易于变化，使用Visitor Pattern是合适的。

优点：增加新的访问者很容易。

缺点：增加新的数据结构困难。因为访问者的实现基于已有的数据结构。

