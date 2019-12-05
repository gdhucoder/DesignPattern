# Proxy Pattern

## 代理模式：

定义：为其他对象提供一种代理以控制对这个对象的访问。

## 场景：

小明喜欢小红，却不敢向小红献殷勤。小明找他的好朋友小刚（代理）帮忙，给小红送洋娃娃、送花、送巧克力。

故事的结局是：来来去去日久生情，代送礼物的小刚（代理）和小红好上了，小明还是单身狗🐶。

![proxy pattern](https://gitee.com/gdhu/testtingop/raw/master/2019-11-19-001.png)

## 代理模式（Proxy）和装饰器模式（Decorator）模式有啥区别呢？

代理模型是控制Client对真实对象的访问，而装饰器模式是给原有的类增加功能。

## 代码

[code example](./code/u007)

```java
public class Client {

  public static void main(String[] args) {
      Proxy xiao_gang = new Proxy(new Pursuit("Lovely Girl"));
      xiao_gang.sendFlower();
      xiao_gang.sendChocolate();
      xiao_gang.sendDoll();
//    Lovely Girl, here is your flower.
//    Lovely Girl, here is your chocolate.
//    Lovely Girl, here is your doll.
  }
}
```

```java
public interface ISendPresents {

  void sendFlower();

  void sendDoll();

  void sendChocolate();
}

class Pursuit implements ISendPresents {

  private String girlName;

  public Pursuit(String name) {
    this.girlName = name;
  }

  @Override
  public void sendFlower() {
    System.out.printf("%s, here is your flower.\n", girlName);
  }

  @Override
  public void sendDoll() {
    System.out.printf("%s, here is your doll.\n", girlName);
  }

  @Override
  public void sendChocolate() {
    System.out.printf("%s, here is your.\n", girlName);
  }
}

class Proxy implements ISendPresents {

  private Pursuit p;

  public Proxy(Pursuit p) {
    this.p = p;
  }

  @Override
  public void sendFlower() {
    p.sendFlower();
  }

  @Override
  public void sendDoll() {
    p.sendDoll();
  }

  @Override
  public void sendChocolate() {
    p.sendFlower();
  }
}
```

2019-11-20