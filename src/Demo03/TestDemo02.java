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
