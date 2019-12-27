# :fire: 手绘设计模式 :fire:

## Preface

Design patterns represent the best practices used by experienced object-oriented software 
developers. Design patterns are solutions to general problems that software developers 
faced during software development. 
These solutions were obtained by trial and error by numerous 
software developers over quite a substantial period of time.

This tutorial will take you through step by step 
approach and examples using Java while learning Design Pattern concepts.

BTW, I have drawn all UMLs by hand. :smiley:

Enjoy! Happy Learning!

Features:

- :white_check_mark: Based on Java
- :white_check_mark: Hand-Drawn UML
- :white_check_mark: 23 common design patterns
- :white_check_mark: **SOLID**

Currently this repo is under heavy development. Keep an eye on it!.

## 目录 Content

### 创建型模式

1. [抽象工厂模式](015_AbstractPattern.md) :提供一个创建一系列或相关依赖对象的接口，而无需指定他们的具体实现类。

2. [建造者模式](013_BuilderPattern.md)：将一个复杂对象的构建和它的表示分离，是的统一的创建过程可以创建不同的表示。

3. [工厂方法](008_FactoryMethodPattern.md)：定义一个用于创建对象的接口，让子类决定实例化哪一个类。工厂方法使一个类的实例化延迟到其子类。

4. [原型模式](009_PrototypePattern.md)：用原型实例指定创建对象的种类，并且通过考虑这些圆形穿件新的对象。

5. [单例模式](021_SingletonPattern.md)：保证一个类仅有一个实例，并提供一个访问它的全局访问点。

## 结构型模式

1. [适配器模式](017_AdapterPattern.md)：将一个类的接口转换成客户希望的另一个接口。适配器模式使得原本由于接口不兼容而不能一起工作的那些类可以一起工作。

2. [桥接模式](022_BrigePattern.md)：将抽象部分与它的实现部分分离，使他们可以独立于变化。

3. [组合模式](019_CompositePattern.md)：将对象组合成树型🌲结构可以表示“部分-整体”的层次结构。组合模式使得用户对单个对象和组合对象的使用具有一致性。

4. [装饰器模式](006_DecoratorPattern.md)：动态地给一个对象增加一些额外的职责。就增加功能来说，装饰模式相比生成子类更加灵活。为已有的功能动态增加功能。

5. [外观模式](012_FacadePattern.md)：为子系统种的一组接口提供一个一致的界面，外观模式定义了一个高层接口，这个接口使得这一子系统更加容易使用。

6. [享元模式](026_FlyweightPattern.md)：运用共享技术有效地支持大量细粒度的对象。

7. [代理模式](007_ProxyPattern.md)：为其他对象提供一种代理以控制对这个对象的访问。

### 行为模式：

1. [观察者模式](014_ObserverPattern.md)：定义对象间的一种多对多的依赖关系，当一个对象的状态发生改变时，所有依赖于它的对象都得到通知并自动更新。
2. [模板方法模式](010_TemplateMethodPattern.md)：定义一个操作的算法骨架，而将一些步骤延迟到子类中，模板方法使得子类可以不改变一个算法的结构即可以重定义该算法的某些特定步骤。 这个比较容易理解。
3. [命令模式](023_CommandPattern.md)：将一个请求封装成为一个对象，从而你可以用不同的请求对客户进行参数化；可以对请求排队或记录请求日志，以及支持可以撤销的操作。
4. [状态模式](016_StatePattern.md)：允许一个对象在其内部状态改变时改变它的行为，让对象看起来似乎改变了它的类。
5. [职责链模式](024_ChainOfResponsibility.md)：使多个对象有机会处理请求，从而避免请求的发送者和接收者之间的耦合关系。将这些对象连成一条链，并沿着这条链传递该请求，直到有一个对象处理它为止。
6. [解释器模式](027_InterpreterPattern.md)：给定一个语言，定义它的文法的一种表示，并定义一个解释器，这个解释器使用该表示来解释语言中的句子。
7. [中介者模式](025_MediatorPattern.md)：用一个中介对象来封装一系列的对象交互。中介者使对象不需要显示的互相引用，从而使其耦合松散，而且可以独立滴改变它们之间的交互。
8. [访问者模式](028_VisitorPattern.md)：表示一个作用于对象结构中的各元素的操作。它使你可以在不改变元素的类的前提下定义用于这些元素的新操作。
9. [策略模式](002_StrategyPattern.md)：定义一系列算法，把它们一个个封装起来，并使它们可以相互替换。本模式可以使得算法独立于使用它的客户而变化。
10. [备忘录模式](018_MementoPattern.md)：在不破坏封装的前提下，捕获一个对象的内部状态，并在该对象之外保存这个状态。这样以后可以将对象恢复到原先保存的状态。
11. [迭代器模式](020_IteratorPattern.md)：提供一种顺序访问一个聚合对象中各个元素，而又不需要暴露该对象的内部表示。


![Fighting](https://gitee.com/gdhu/testtingop/raw/master/2019-12-27_001.jpg)


