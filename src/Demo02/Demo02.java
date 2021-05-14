package Demo02;

/**
 * @version 1.0
 * @author: jiazhihao
 * @date: 2021-05-13 10:31
 */
public class Demo02 {
    public static void main(String[] args) {
        // final 修饰的是李四这个对象
        final Demo01 list  = new Demo01("李四");
        // 李四对象中name 属性并没有被final修饰
        list.setName("张三");
        //最终输出内容：Demo01{name='张三'}
        System.out.println(list.toString());
    }
}
