
# 迭代器模式

## 定义

迭代器模式提供一种方法顺序访问聚合对象中各个元素，而又不暴露该对象的内部表示。

## 类图

![iterator-pattern](https://gitee.com/gdhu/testtingop/raw/master/2019-12-01_017.jpg)

## 用例

迭代器模式已经在编程语言内部中实现了。

样例见代码。[code example](./code/u020)

## 实际应用

例如我们听音乐的app中的播放列表。我们可以选择顺序播放，或者随机播放。

## 注意

>A collection is only useful when it’s provides a way to access its elements without exposing its internal structure. The iterators bear this responsibility.
 
>So any time, we have collection of objects and clients need a way to iterate over each collection elements in some proper sequence, we must use iterator pattern to design the solution.

当要遍历集合内部对象的时候就可以使用迭代器模式。

实现可以参考Java中的`List`抽象类中会创建一个`Iterator`, `Iterator`接口中有抽象方法例如`hasNext()`,`next()`,`remove`.
`ArrayList`继承`List`，其中会创建一个`ArrayItr`.

```java
private static class ArrayItr<E> implements Iterator<E> {
        private int cursor;
        private final E[] a;

        ArrayItr(E[] a) {
            this.a = a;
        }

        @Override
        public boolean hasNext() {
            return cursor < a.length;
        }

        @Override
        public E next() {
            int i = cursor;
            if (i >= a.length) {
                throw new NoSuchElementException();
            }
            cursor = i + 1;
            return a[i];
        }
    }
```

## 参考

[howtodo-iterator-pattern](https://howtodoinjava.com/design-patterns/behavioral/iterator-design-pattern/)