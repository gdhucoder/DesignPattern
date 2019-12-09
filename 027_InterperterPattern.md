
# 解释器模式（Interpreter Pattern）

## 定义

使用面向对象的方式定义一种语言和语法，并定一个解释器，这个解释器用来计算表达式的值。

In short, the pattern defines the grammar of a particular language i
n an object-oriented way which can be evaluated by the interpreter itself.

构建抽象语法树，并解释。

build abstract syntax trees and then run the interpretation.

## 类图

![Interpreter Pattern](https://gitee.com/gdhu/testtingop/raw/master/2019-12-09_025.jpg)

## 用例

环境：保存处理过程中的整个状态。在解释类中会被重用。

终止表达式：停止解释，返回结果。

非终止表达式：包含一个或多个抽象表达式，可以递归的解释。

客户端：创建抽象语法树。初始化环境，调用解释器解释。

## 实际应用

JDK中的使用：

`java.util.Pattern`

`java.text.Format`

`java.text.Normalizer`

[normalizer的使用](https://juejin.im/entry/5cbd5f485188250ab10aaee8)

## 参考

[baeldung-interpreter-pattern](https://www.baeldung.com/java-interpreter-pattern)