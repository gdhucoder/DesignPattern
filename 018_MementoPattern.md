
# 备忘录模式（Memento Pattern）

## 定义

在不破坏封装性的前提下，捕获一个对象的内部状态，并在这个对象之外保存这个状态。
这样可以将对象恢复到原先保存的状态。

The intent of memento pattern is to capture the internal state of an object 
without violating encapsulation and thus providing a mean for restoring the object 
into initial state when needed.

## 类图

![MementoPattern](https://gitee.com/gdhu/testtingop/raw/master/2019-11-30_015.jpg)

## 用例

大鸟🐦和小菜讨论了游戏保存进度的例子。具体见代码。

[code example](./code/u018)

## 实际应用

备忘录模式用于需要"撤销"，"恢复"或者"回滚"的情形。

- 我们的编辑器`Ctrl-Z`的功能
- IDE关闭后的打开恢复状态
- 等等

## 注意

- 广义的讲：memento pattern，目的是保存状态、恢复状态，没有固定的实现规则。
- 考虑对性能的影响
- 多次回滚是否考虑用stack实现
- `Ctrl-Y`的功能要如何实现呢？可以考虑再家一个stack

## 参考

[howtodo-memento-pattern](https://howtodoinjava.com/design-patterns/behavioral/memento-design-pattern/)