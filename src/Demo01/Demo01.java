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
