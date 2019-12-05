
# 状态模式（State Pattern）

## 定义

Allows an object to alter its behaviour when its internal state changes. The object will appear to change its class.

允许对象内部状态改变时，改变其行为。对象看起来像改变了其类。


## 类图

![2019-11-28_008.jpg](https://gitee.com/gdhu/testtingop/raw/master/2019-11-28_008.jpg)

## 用例

小菜加班的例子。详细见代码。

实际更好的例子是：网购。物品的状态依次是：下单，发货，物流公司收件，派件，签收。包裹的状态每个步骤都在改变。每个状态对应两个动作：处理包裹和改状态。

[code example](./code/u016)

## 实际应用

消除庞大的分支语句。

有点像状态机。

## 注意

具体状态类中的状态变量可以设置为单例。

## 参考

[how-to-do-state-pattern](https://howtodoinjava.com/design-patterns/behavioral/state-design-pattern/)