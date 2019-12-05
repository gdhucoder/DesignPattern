## 建造者模式（Builder Pattern）

## 定义

The builder pattern is a design pattern that allows for the step-by-step creation of complex objects using the correct sequence of actions. The construction is controlled by a director object that only needs to know the type of object it is to create.

建造者模式使用一些列动作一步步创建复杂对象。指挥者控制对象的创建，只需要知道它要创建对象的类型即可。

## 类图

![builder pattern](https://gitee.com/gdhu/testtingop/raw/master/2019-11-24_001.jpg)

## 用例

《大话设计模式》中举了一个画小人的例子。意思是说小人分胖瘦，但画的流程是一样的：脑袋、身子、胳膊和腿。所以可以使用Builder Pattern。

具体实现见代码。

[code example](./code/u013)

## 实际应用

建造者模式实际应用中往往不这么用。

例如Java的线程不安全的StringBuilder.append 和 线程安全的StringBurffer.append。 代码中有类似的结构：

```java
    @Override
    public StringBuilder append(boolean b) {
        super.append(b);
        return this;
    }
```

## 使用中注意的地方

建造者模式用于创建一些复杂对象，对象内部的构建过程顺序通常是稳定的。内部的构建往往面临的变化。

## 参考

 - 大话设计模式
 - [dzone-builder](https://dzone.com/articles/design-patterns-builder)
 - [howtodoinjava-builder](https://howtodoinjava.com/design-patterns/creational/builder-pattern-in-java/)
 - [turotialspoint-builder](https://www.tutorialspoint.com/design_pattern/builder_pattern.htm)
 - [wiki-fluent_interface](https://en.wikipedia.org/wiki/Fluent_interface)