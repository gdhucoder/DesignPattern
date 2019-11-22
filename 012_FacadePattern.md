## 外观模式（Facade Pattern）

## 定义

外观模式（Facade Pattern）

*Provide a unified interface to a set of interfaces in a subsystem. Façade defines a higher-level interface that makes the subsystem easier to use.*

为子系统的一组接口提供一个同一的接口。外观模式定义一个高层接口，这个接口使得子系统更容易使用。

## 结构图

![facade pattern](https://gitee.com/gdhu/testtingop/raw/master/2019-11-22_011.jpg)

## 用例

投资买基金的例子。我们都想理财，很多小白不懂股票，也不知道如何选择，导致赔了不少钱💰。买基金是个不错的选择，它是一组股票的组合。有专业的管理人进行操作。我们只需要找对应的基金管理公司买基金即可。

详细实现见代码。

上面的例子中基金Fund类作为外观（Facade），Client只需要调用Fund的buy和sell方法即可，不需要知道子系统（各种股票、实体投资、国债）。

## 何时使用外观模式

- 设计初期，使得几个层隔离
- 开发阶段：系统需要重构演化，外观模式可以提供简单的接口，减少彼此依赖
- 遗留大型系统：新系统与Facade对象交互，Facade与旧系统交互。

