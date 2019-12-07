
# 职责链模式（Chain of Responsibility Pattern）

## 定义

将发送请求的处理连成一条链，沿着这条链传递请求，直到处理完成为止。

## 类图

![Chain of Responsibility](https://gitee.com/gdhu/testtingop/raw/master/2019-12-07_022.jpg)

## 用例

《大话设计模式》中讲了小菜申请加薪的例子。加薪需要总经理审批。

生活中的例子是出去度假，可能要请10天假，这是就需要总监或者经理审批了。

[code example](./code/u024)

## 实际应用

`javax.servlet.Filter#doFilter()`

`java.util.logging.Logger#log`

If the logger is currently enabled for the given message level 
then the given message is forwarded to all the registered output Handler objects.

## 参考

[chain-of-responsibility](https://howtodoinjava.com/design-patterns/behavioral/chain-of-responsibility-design-pattern/)