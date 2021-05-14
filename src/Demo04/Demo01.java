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
