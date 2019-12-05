
# 桥接模式（Bridge Pattern）

合成（组合）/ 聚合复用原则，尽量使用组成/聚合，尽量不用类继承。

## 定义

桥接模式（Bridge）：将抽象部分与它的实现部分分离，是他们都可以独立变化。

## 类图

![bridge pattern](https://gitee.com/gdhu/testtingop/raw/master/2019-12-05_018.jpg)

## 用例

[code example](./code/u022)

## 实际应用

- 桥接模式将抽象与实现解耦，二者可以独立变化。
- 它主要用于实现平台独立的功能。
- 方法重定向实现功能
- 接口抽象发布在单独的继承体系中，将其实现在自己的继承结构中。
- 使用桥接模式实现运行是绑定（确定类）。
- 使用桥接模式映射正交类层次结构（不相关的类）
- 预先设计，使得抽象和实现独立变化。

另一中解释，体会体会。实现系统可能多角度分类，每一种分类都有可能变化，那么就把这种多角度分类出来让他们独立变化，减少他们之间的耦合。

## 参考

[howtodo-bridge-pattern](https://howtodoinjava.com/design-patterns/structural/bridge-design-pattern/)