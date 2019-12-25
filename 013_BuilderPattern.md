## 建造者模式（Builder Pattern）

## 定义

The builder pattern is a design pattern that allows for the step-by-step creation of complex objects using the correct sequence of actions. The construction is controlled by a director object that only needs to know the type of object it is to create.

建造者模式使用一些列动作一步步创建复杂对象。指挥者控制对象的创建，只需要知道它要创建对象的类型即可。

## 类图

![builder pattern](https://gitee.com/gdhu/testtingop/raw/master/2019-11-24_001.jpg)

## 用例

《大话设计模式》中举了一个画小人的例子。意思是说小人分胖子瘦子，但画的流程是一样的：脑袋、身子、胳膊和腿。所以可以使用Builder Pattern。

具体实现见代码。

[code example](./code/u013)

## 实际应用

建造者模式实际应用中往往不这么用：

```java
public class User 
{
    //All final attributes
    private final String firstName; // required
    private final String lastName; // required
    private final int age; // optional
    private final String phone; // optional
    private final String address; // optional
 
    private User(UserBuilder builder) {
        this.firstName = builder.firstName;
        this.lastName = builder.lastName;
        this.age = builder.age;
        this.phone = builder.phone;
        this.address = builder.address;
    }
 
    //All getter, and NO setter to provde immutability
    public String getFirstName() {
        return firstName;
    }
    public String getLastName() {
        return lastName;
    }
    public int getAge() {
        return age;
    }
    public String getPhone() {
        return phone;
    }
    public String getAddress() {
        return address;
    }
 
    @Override
    public String toString() {
        return "User: "+this.firstName+", "+this.lastName+", "+this.age+", "+this.phone+", "+this.address;
    }
 
    public static class UserBuilder 
    {
        private final String firstName;
        private final String lastName;
        private int age;
        private String phone;
        private String address;
 
        public UserBuilder(String firstName, String lastName) {
            this.firstName = firstName;
            this.lastName = lastName;
        }
        public UserBuilder age(int age) {
            this.age = age;
            return this;
        }
        public UserBuilder phone(String phone) {
            this.phone = phone;
            return this;
        }
        public UserBuilder address(String address) {
            this.address = address;
            return this;
        }
        //Return the finally consrcuted User object
        public User build() {
            User user =  new User(this);
            validateUserObject(user);
            return user;
        }
        private void validateUserObject(User user) {
            //Do some basic validations to check 
            //if user object does not break any assumption of system
        }
    }
}
And below is the way, we will use the UserBuilder in our code:

public static void main(String[] args) {
    User user1 = new User.UserBuilder("Lokesh", "Gupta")
    .age(30)
    .phone("1234567")
    .address("Fake address 1234")
    .build();
 
    System.out.println(user1);
 
    User user2 = new User.UserBuilder("Jack", "Reacher")
    .age(40)
    .phone("5655")
    //no address
    .build();
 
    System.out.println(user2);
 
    User user3 = new User.UserBuilder("Super", "Man")
    //No age
    //No phone
    //no address
    .build();
 
    System.out.println(user3);
}
 
Output:
 
User: Lokesh, Gupta, 30, 1234567, Fake address 1234
User: Jack, Reacher, 40, 5655, null
User: Super, Man, 0, null, null
```

例如Java的线程不安全的StringBuilder.append 和 线程安全的StringBurffer.append，实现了java.lang.Appendable接口。 代码中有类似的结构：

```java
    @Override
    public StringBuilder append(boolean b) {
        super.append(b);
        return this;
    }
```

## 使用中注意的地方

建造者模式用于创建一些复杂对象，对象内部的构建过程顺序通常是稳定的，但内部的构建往往面临的变化。

## 好处

代码易读

构造方法参数比较少

可以创建不可变类

## 参考

 - 大话设计模式
 - [dzone-builder](https://dzone.com/articles/design-patterns-builder)
 - [howtodoinjava-builder](https://howtodoinjava.com/design-patterns/creational/builder-pattern-in-java/)
 - [turotialspoint-builder](https://www.tutorialspoint.com/design_pattern/builder_pattern.htm)
 - [wiki-fluent_interface](https://en.wikipedia.org/wiki/Fluent_interface)