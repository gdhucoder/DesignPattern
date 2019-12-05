
## 定义

Convert the interface of a class into another interface clients expect. 
Adapter lets classes work together that couldn't otherwise because of 
incompatible interfaces.

把一个类的接口转换为客户需要的另外一个接口。使得因不兼容接口而不能一起工作的类一起工作。

## 类图

![Adapter Pattern](https://gitee.com/gdhu/testtingop/raw/master/2019-11-29_014.jpg)

## 用例

《大话设计模式》中讲了姚明刚到美国打球🏀需要翻译的例子。翻译就是适配器，姚明就是需要适配的对象。详细请看代码。

[code example](./code/u017)

## 实际应用

生活中的例子：电源转换插头，就是适配器。

```java
    // System.in inputstream
    // BufferedReader <--> character
    // InputStream <--> bytes stream
    // InputStreamReader: Adapter (bytes stream to character)
    BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
```



## 注意

Adapter Pattern只是一个妥协，应当提前在设计方面避免使用adapter pattern。

## 参考

[howtodo-adapter-pattern](https://howtodoinjava.com/design-patterns/structural/adapter-design-pattern-in-java/)