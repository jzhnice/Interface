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
