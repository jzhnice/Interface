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
