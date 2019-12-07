
# 中介者模式（Mediator Pattern）

## 定义

中介者模式一系列对象的对象的交互。使得对象间不需要显示的引用，使得耦合松散。
可以独立改变他们之间的交互。

mediator pattern defines an object that encapsulates 
how a set of objects interact. Mediator promotes loose 
coupling by keeping objects from referring to each other explicitly, 
and it lets us vary their interaction independently.

Allows loose coupling by encapsulating the way disparate sets of objects 
interact and communicate with each other.  
Allows for the actions of each object set to vary independently of one another. 

## 类图

![Mediator Pattern](https://gitee.com/gdhu/testtingop/raw/master/2019-12-07_023.jpg)

## 用例

《大话设计模式》中举的例子是联合国安理会做为中介者，调节各国之间的关系。

代码中的示例是聊天室的例子。

[code example](./code/u025)

## 实际应用

- 现实生活中机场的航空管制。
- 聊天室

The following are the usages of the Mediator Pattern in JDK.

```java
java.util.concurrent.ScheduledExecutorService (all scheduleXXX() methods)
java.util.concurrent.ExecutorService (the invokeXXX() and submit() methods)
java.util.concurrent.Executor#execute()
java.util.Timer (all scheduleXXX() methods)
java.lang.reflect.Method#invoke()
```

## 参考

[mediator used in java](https://www.javacodegeeks.com/2015/09/mediator-design-pattern.html)