
# 策略模式（Strategy Pattern）

## 定义
 
定义了算法家族，分别封装起来，让它们之间可以互相替换，此模式让算法的变化不影响到使用算法的客户。
 
## 类图

![strategy pattern](https://gitee.com/gdhu/testtingop/raw/master/2019-12-10_031.jpg)

## 用例

《大话设计模式》中举了商场促销的例子。

具体见代码 [code example](./code/u002)

## 实际应用

Java `Collections.sort(list, comparator)` method where client actually passes suitable 
comparator based on the requirement in runtime to the method and the method is generic to accept any comparator type. 
Based on the comparator being passed, same collection can be sorted differently.

## 参考

[howtodo-strategy-pattern](https://howtodoinjava.com/design-patterns/behavioral/strategy-design-pattern/)