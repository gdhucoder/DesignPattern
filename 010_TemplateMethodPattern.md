# 模板方法模式

## 定义

Defines the skeleton of an algorithm in a method, 
deferring some steps to subclasses. 
Template Method lets subclasses redefine certain steps of 
an algorithm without changing the algorithms structure.

定义算法骨架，将一些步骤推迟到子类中。模版方法可以不改变算法结构，重新定义一个算法的某些特定步骤。

![template method pattern](https://gitee.com/gdhu/testtingop/raw/master/2019-11-21_008.jpg)

## 注意的地方

- 将模版方法标记为final
- 子类相同的逻辑、代码方法，在抽象类中提供实现
- 子类不同具体实现的方法，定义为abstract方法

## 例子

一个跨平台的编译器，详见代码。

## 应用

Java InputStream中的read()方法