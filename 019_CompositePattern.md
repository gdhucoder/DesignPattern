
# 组合模式（Composite Pattern）

## 定义

Composite design pattern compose objects into tree structures to represent whole-part hierarchies. 
Composite lets clients treat individual objects and compositions of objects uniformly.

将对象组合成树状结构以表示整体的层次结构。
使得用户对单个对象和组合对象的使用，具有一致性。

## 类图

![composite pattern](https://gitee.com/gdhu/testtingop/raw/master/2019-12-01_016.jpg)

## 用例

举的例子是小菜写公司OA系统遇到的困难。详细见代码。

[code example](./code/u019)

## 实际应用

- 公司员工之间的上下级关系。
- GUI
- 文件系统

## 什么时候使用

层级结构，组件功能类似，可以很容易新增组件，组件间可以组合。

## 参考

[howtodo-composite-patterns](https://howtodoinjava.com/design-patterns/structural/composite-design-pattern/)