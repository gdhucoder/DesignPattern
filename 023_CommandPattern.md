
# 命令模式（Command）

## 定义

Encapsulate a request as an object, 
thereby letting you parameterize clients with different requests, 
queue or log requests, and support undoable operations.

将请求封装成对象，从而使你可用不同的请求对客户进行参数化；对请求排队或记录请求日志，以及支持可撤销的操作。

## 类图

![command pattern](https://gitee.com/gdhu/testtingop/raw/master/2019-12-06_020.jpg)

## 用例

![人生一串](https://gitee.com/gdhu/testtingop/raw/master/2019-12-07_021.jpg)

《大话设计模式》中举的小菜和大鸟去吃羊肉串的例子。
去串肉吃烧烤，和服务员下单，服务员告诉烤串师傅烤串。
而不是自己去后厨告诉师傅说你要点啥。

理解了这个例子就比较好理解命令模式。

[code example](./code/u023)

## 实际应用

Java的Runnable接口是一种命令模式。

## 注意

- 每个command都有指向receiver的引用
- command中的execute调用receiver中的具体逻辑方法
- receiver执行具体的业务逻辑

## 参考

[howtodo-command-pattern](https://howtodoinjava.com/design-patterns/behavioral/command-pattern/)