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
