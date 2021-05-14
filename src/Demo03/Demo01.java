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