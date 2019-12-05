
## 观察者模式（发布-订阅模式）

## 定义

Define a one-to-many dependency between objects so that when one object changes state, 
all its dependents are notified and updated automatically.

定义一种一对多的依赖关系，一个对象发生改变时，所有依赖于它的都会自动通知和更新。

类图：

![ObserverPattern](https://gitee.com/gdhu/testtingop/raw/master/2019-11-26_006.jpg)

[youtube-observer-pattern](https://www.youtube.com/watch?v=WRkw0l72BL4)

## 用例

前台通知办公室的小伙伴们老板要回来啦！

[code example](./code/u014)

## 实际应用

当一个对象的状态改变需要通知其他对象的时候考虑使用观察者模式。让双方都依赖于抽象。

## 观察者模式的不足

可能没有办法让每个类都实现Observer接口。实际使用事件委托机制EventHandler。下篇文章讲EventHandler。

2019-11-26





