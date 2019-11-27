# 抽象工厂模式

## 定义

Provides an interface for creating families of related or dependent objects without specifying their concrete classes.

提供一个创建一系列相关或者相互依赖对象的接口，而无需制定它们具体的类。


## 类图

![abstract factory pattern](https://gitee.com/gdhu/testtingop/raw/master/2019-11-26_007.jpg)

## 用例

大话设计模式中提到了一个换数据库的例子。具体实现见代码。

## 实际应用

java 中 `DocumentBuilderFactor`

>whenever you need another level of abstraction over a group of factories, you should consider using the abstract factory pattern.

## 注意

新增代码时需要增加的代码量变多。

## 参考

[abstact-factory-pattern](https://howtodoinjava.com/design-patterns/creational/abstract-factory-pattern-in-java/)

[dzone-abstract-factory-pattern](https://dzone.com/articles/design-patterns-abstract-factory)