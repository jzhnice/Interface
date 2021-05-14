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


