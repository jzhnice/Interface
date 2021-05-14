# Java面向对象编程——抽象类和接口

定义类的过程就是抽象和封装的过程，而抽象类与接口则是对实体类进行更高层次的抽象，进定义公共行为和特征。

## 抽象类：

如果一个类没有足够的信息去描述一个具体的对象，那我们就称之为抽象类。

语法格式:

```java
public abstract class 类名{}
```

案例代码:

```java
package Demo01;

/**
 * @version 1.0
 * @author: jiazhihao
 * @date: 2021-05-13 10:31
 */
public class Demo01 {
    // 定义动物抽象类
    public abstract  class Animal{
        
    }
}
```



抽象方法：

有了抽象类，类中就要有与之对应的抽象方法。抽象发发就是用abstract修饰的方法，这种方法值声明返回的数据类型，方法名称和所需要的参数，没有方法体。也就是说在抽响雷中声明抽象方法时，值需要声明方法，不需要定义方法体。子类在继承父类时，必须重写父类的抽象方法，这也是抽象方法存在的意义。

语法格式:

```java
public abstract 返回值类型 方法名（参数列表）； 
```

案例代码：



```JAVA
package Demo01;

/**
 * @version 1.0
 * @author: jiazhihao
 * @date: 2021-05-13 10:31
 */
public class Demo01 {
    // 定义动物抽象类
    public abstract  class Animal{
    public abstract void go(); //  名为go的抽象方法，注意方法没有大括号
    }
}
```



抽象类和抽象方法具体该怎么使用？ 抽象方法的作用是 什么？

案例代码

```java
package Demo01;

/**
 * @version 1.0
 * @author: jiazhihao
 * @date: 2021-05-13 10:31
 */
public class Demo01 {
    // 定义动物抽象类
    public abstract  class Animal{
    public abstract void go(); //  名为go的抽象方法，注意方法没有大括号
    }

    public class Demo02 extends Demo01 {

        public void go(){
            System.out.println("鸟飞的块");
        }

    }

    public class Demo03 extends Demo01{
        public void go(){
            System.out.println("狗跑的块");
        }
    }

    


}

```

测试类：

```java
package Demo01;

/**
 * @version 1.0
 * @author: jiazhihao
 * @date: 2021-05-13 10:42
 */
public class Demo04 {
    public static void main(String[] args) {
        Demo02 d = new Demo02();
        d.go();
        Demo03 demo03 = new Demo03();
        demo03.go();
    }
}
```

通过上面的代码我们可以总结：

定义抽象类就是用于继承的。和一般类的继承相比，子类继承抽象类必然会实现抽象方法。由于抽象方法都是没有方法体的，也就是说，抽象方法并没有写死，我么可以根据自己的需求去写

抽象类是一种模板式设计，通常是对同类事物相对具体的抽象。抽象类通常包含抽象方法、实体方法、属性变量。。我们在使用抽象方法和抽象类时，需要注意以下几点。

（1）包含抽象方法的类一定时抽象类。

（2）抽象类中的方法不一定都是抽象方法。抽象类也可以没有抽象方法

（3）构造方法不能声明为抽象方法

（4）abstract 不能与private 、static、final、native并修饰同一个方法





## final修饰符

使用：

显示生活中，我们的身份证一经确定，身份证号就不能在此修改了。那我们Java中某些数据是定值，为了保证计算的正确性，不能在被修改，应该怎末办呢？这时候就用到了final修饰符，表示最终的。

### final使用有以下几种情况。

（1）修饰类

（2）修饰方法

（3）修饰对象和变量



## 修饰类：

1. 被final修饰过的类不能被继承

2. .因为不能被继承，所以此类中的所有方法默认都是final修饰

3. 该类如果不需要子类，不需要被扩展，类中的方法不允许被重写，就是用final

   ### 修饰方法：

   被final修饰的方法可以被继承，不能被覆盖重写

   ### 修饰对象和变量：

   final修饰一个对象，那么这个对象的引用不能变，但是值是可以变的。如果是基础类型，那么值不可变。

   案例代码：

   ```java
   package Demo02;
   
   ;
   
   /**
    * @version 1.0
    * @author: jiazhihao
    * @date: 2021-05-13 10:31
    */
   public class Demo01 {
       public String name;
   
       public Demo01(String name) {
           super();
           this.name = name;
       }
   
       public String getName() {
           return name;
       }
   
       public void setName(String name) {
           this.name = name;
       }
   
       @Override
       public String toString() {
           return "Demo01{" +
                   "name='" + name + '\'' +
                   '}';
       }
   }
   
   
   ```

   测试类：

   ```java
   package Demo02;
   
   /**
    * @version 1.0
    * @author: jiazhihao
    * @date: 2021-05-13 10:31
    */
   public class Demo02 {
       public static void main(String[] args) {
           // final 修饰的是李斯特这个对象
           final Demo01 list  = new Demo01("李四");
           // 李四对象中name 属性并没有被final修饰
           list.setName("张三");
           //最终输出内容：Demo01{name='张三'}
           System.out.println(list.toString());
       }
   }
   
   ```





## 接口

在生活中，接口时一套规范，满足这个规范的设备，就可以组装在一起。

接口就像插座一样，一种插孔可以插很多种电器，这个插孔就是我们像外卖呢提供的接口，所有的电器都要实现这个接口

为什么需要接口？

和抽象类对同类事物进行抽象不同，接口不是类，而是一组对类的需求描述（可以看成只有抽象方法的抽象类）。这要求接口采用锲约式、开放式对需求进行设计，这样才能满足不同事物的相同要求。

### 接口的使用

在软件中，接口同样是一种规范和标准，他们可以约束类的行为，是一些方法特征的集合，但没有方法的实现，需要类对接口进行实现。

Java中接口的定义语法：

   ```java
   [修饰符] interface 接口名 extends 父接口1，父接口2 ..{
       // 常量定义
       // 方法定义
   }
   ```

类实现接口的语法如下

```java
class 类名 extends父类名 implement  接口1 ，接口2 ，，，{
    //类成员
}
```



**interface**  之中可以定义变量和方法，变量必须是**public** **static** **final**的，方法必须是**public** 、**abstract**的

说明：

（1）接口的命名规则与类相同。如果修饰符是public，则该接口在整个项目中可见；如果省略修饰符，则该接口只在当前包可见。

（2） 接口中可以定义常量，不能定义变量。接口中的属性都会自动用public static final 修饰

（3）接口中的所有方法都是抽象方法。接口中方法都会自动用 public abstract修饰，即接口中只有全局抽象方法

（4）和抽象类一样，接口也不能实例化，接口中不饿能有构造方法

（5）接口之间可以通过extends来实现继承关系，一个接口可以继承多个接口，但接口不能继承类。

(6)实现接口的类必须实现接口的全部方法，否则必须定义为抽象类

（7）一个类只能有一个直接父类，但可以通过implements是西安多个接口。当类在继承父类的同时有实现了多个接口时，extends关键字必须位于implements 关键字之前



案例代码：

（1）约定Usb接口标准

（2）制作符合Usb接口约定的各种具体设备

（3）将Usb设备插到Usb接口上进行工作



```java
package Demo03;/**
*@author: jiazhihao
*@date:  2021-05-14 09:08
*@version 1.0
*/public abstract class Demo01 {

    public interface Usb{
        public void run();
    }

    static class UsbPrinter implements Usb{
        @Override
        public void run(){
            System.out.println("Usb连接中，打印机连接中，开始工作");
        }
    }
    static class UsbMouse implements  Usb{
    @Override
    public void run(){
        System.out.println("Usb 连接中 ，鼠标连接中，开始工作");
    }  }
    static class Test{
        public static  void main(String[] args){
            Usb a = new UsbPrinter();
            Usb B = new UsbMouse();

            a.run();
            B.run();
        }
    }
}
```

### 接口是一种能力使用

接口是一种能力，一个类实现了某个接口，就表示这个类具备了某种能力。

案例代码：

```java
package Demo03;

import org.w3c.dom.ls.LSOutput;

/**
 * @version 1.0
 * @author: jiazhihao
 * @date: 2021-05-14 09:24
 */
public class Demo02 {
    static  public abstract class Venicle {
        public abstract void run();

        public abstract void stop();
    }

    static  interface Lock {
        void lock();

        void open();
    }
      static class Car extends Venicle implements Lock{

        @Override
        public void run() {
            System.out.println("开完锁，发动引擎，驾驶员驾驶者汽车开始行驶");

        }

        @Override
        public void stop() {
            System.out.println("驾驶员将发动机熄火，准备锁上汽车");

        }

        @Override
        public void lock() {
            System.out.println("插进钥匙，向左旋转三圈，拔出钥匙");

        }

        @Override
        public void open() {
            System.out.println("插进钥匙，向右旋转三圈，所打开了，拔出钥匙");

        }
    }
}
```

测试类：

```java
package Demo03;

/**
 * @version 1.0
 * @author: jiazhihao
 * @date: 2021-05-14 09:41
 */
public class TestDemo02 {
    public static  void main(String[] args){
        Demo02.Car  car = new Demo02.Car();

        car.lock();
        car.open();
        car.run();
        car.stop();
    }
}
```



既然接口代表一种能力，那么我i们在开车和停车的基础上，扩展行车记录仪记录功能，需要增加一种能力

代码：

```java
package Demo03;

/**
 * @version 1.0
 * @author: jiazhihao
 * @date: 2021-05-14 09:24
 */
public class Demo03 {
    static  public abstract class Venicle {
        public abstract void run();

        public abstract void stop();
    }

      interface Lock {
        void lock();

        void open();
    }

    interface TripREC{
        void record();
    }


      static class Car extends Venicle implements Lock{

        @Override
        public void run() {
            System.out.println("开完锁，发动引擎，驾驶员驾驶者汽车开始行驶");

        }

        @Override
        public void stop() {
            System.out.println("驾驶员将发动机熄火，准备锁上汽车");

        }

        @Override
        public void lock() {
            System.out.println("插进钥匙，向左旋转三圈，拔出钥匙");

        }

        @Override
        public void open() {
            System.out.println("插进钥匙，向右旋转三圈，所打开了，拔出钥匙");

        }


        public void record(){
            System.out.println("行车记录仪开始录像");
        }
    }
}
```

测试类:

```java
package Demo03;

/**
 * @version 1.0
 * @author: jiazhihao
 * @date: 2021-05-14 09:41
 */
public class TestDemo03 {
    public static  void main(String[] args){
        Demo03.Car  car = new Demo03.Car();

        car.lock();
        car.open();
        car.run();
        car.stop();
        car.record();
    }
}
```

从结果中可以看出：

接口在代码的扩展和维护方面十分方柏霓。接口类似于一个组件，需要时可以自由组装。从使用角度来讲，接口和抽象类的区别在于：抽象类利于代码复用，接口利于代码维护

### 接口是一种约定

接口其实就是一种约定，实现接口的类就必须遵守这个接口的约定

### Java8中接口的变化

在 JDK 8及以后，允许我们在接口中定义**static**方法和**default**方法，这两种方法可以有方法体

1. **default**方法属于实例，**static**方法属于接口或类。要注意的是 **default**方法可以被继承，**static**方法不能被继承

2. ###### 如果一个类实现了多个接口，并且这些接口之间没有相互继承关系，同时存在相同的default方法时会报错，不过可以在实现类中重写default方法并通过“**<接口>.super.<方法名>();"**

   ##### 静态方法：

   在接口中增加静态方法。理论上讲。没有任何理由认为这是不合法的。只是这有违将接口作为抽象规范的初衷

   案例代码：



```java
package Demo04;

/**
 * @version 1.0
 * @author: jiazhihao
 * @date: 2021-05-14 10:02
 */
public class Demo01 {
    public static void main(String[] args) {
                //静态方法不会被继承
        TestInter.staticMethh();
        TestInter2.staticMethh2();
        
    }
}

interface TestInter{
    static void staticMethh(){
        System.out.println("TestInter中的静态方法");
    }
}
interface TestInter2{
    static void staticMethh2(){
        System.out.println("TestInter2中的静态方法");
    }
}

```

##### 默认方法：

default关键字修饰接口的方法，使其称为默认方法。目的时减少子类实现接口的工作量。

案例代码：

先看没有使用默认方法的方式：

```java
package Demo04;

/**
 * @version 1.0
 * @author: jiazhihao
 * @date: 2021-05-14 10:18
 */
public class Demo02 {
    public interface Log {
        void login(String name);
    }

    class Emp implements Log{
        @Override
        public void login(String name){
            System.out.println("用户"+name+":登陆系统");
        }

    }
    class Student implements  Log{
        @Override
        public void login(String name){
            System.out.println("用户"+name+";登陆系统");
        }
    }
}

```

再看使用默认方法之后的代码：

```java
package Demo04;

/**
 * @version 1.0
 * @author: jiazhihao
 * @date: 2021-05-14 10:21
 */
public class Demo03 {
    public interface Log{
        default  void login(String name){
            System.out.println("用户"+name+":登陆系统");
        }
    }

    static class Emp implements Log{}
    static class Student implements Log{}
    static class DefaultMethodTest{
        public static void main(String[] args) {
            Emp emp = new Emp();
            emp.login("张三");
            Student student = new Student();
            student.login("李四");
        }
    }
}
```

结论：

如果多个子类实现某个接口方法，方法体都是一样的，这就导致后期维护上的困难，如果在接口中定义了默认的实现，那么即减少了子类实现的接口的工作量，也为后期的维护提供了方便（只需要更改接口中的默认实现即可）



## 总结

面向接口编程可以实现接口和现实的分离，这样做最大的好处就是能够在客户端位置的情况下修改是实现代码，那么怎样抽象出接口呢？一种时用在层与层的调用。层与层之间最机会耦合度过高或修改过于频繁。设计优秀的接口能够解决这个问题，

另一种时是使用在那些不稳定的部分上。如果某些需求的变化性很大，那么定义接口也是一种解决方法，设计良好的接口就像日常使用的万能插座，不论插头如何变化，都可以使用

当纠结定义接口还是抽象类时，优先推荐定义为接口，遵循接口隔离原则，按某个维度划分成多个接口，然后在用抽象类去是实现某些接口，这样做可方柏霓后续的扩展和重构。

