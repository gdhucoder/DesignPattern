# 工厂方法模式（Factory Method）

## 使用简单工厂模式设计一个计算器

类图：

![simple factory](https://gitee.com/gdhu/testtingop/raw/master/2019-11-20_004.jpg)

简单工厂模式例如要添加新的操作类时，例如除法，需要修改OperateFactory的判断逻辑（<u>***缺点：此处违反了开放-封闭原则***</u>）和添加新的操作类DivOper。不需要修改客户端。

针对上面的简单工厂模式的不足，对工厂模式进一步抽象，提出工厂方法模式。

## 使用工厂方法模式设计该计算器

类图：

![factory method](https://gitee.com/gdhu/testtingop/raw/master/2019-11-20_007.jpg)

如果使用工厂方法模式，克服简单工厂模式的缺点，在添加新的操作类时，<u>需要添加新的操作类DivOper和DivFactory</u>。<u>客户端需要修改一行代码</u>：
`IOperationFactory operationFactory = new AddFactory();`。

工厂方法模式的不足：

- 添加新的操作类时，需要添加对应的产品工厂类，增加了代码量。
- 不可避免的修改了客户端的代码。

如何避免修改客户端代码呢？这个问题先留着，稍后我们解决它！


