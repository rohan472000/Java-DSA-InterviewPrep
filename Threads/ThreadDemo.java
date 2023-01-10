package Threads;
class Hi extends Thread{
  public void show(){
      for (int i = 0; i < 5; i++) {
          System.out.print("Hi");
          try{Thread.sleep(500);}catch (Exception e){}
      }
  }
}
class Hello extends Thread implements Runnable{
    public void run(){
        for (int i = 0; i < 5; i++) {
            System.out.print("Hello");
            try{Thread.sleep(500);}catch (Exception e){}
        }
    }
}
public class ThreadDemo {
    public static void main(String[] args) {
      Hi obj1 = new Hi();
      Hello obj2 = new Hello();

      obj1.show();
      //obj2.show();

      obj1.start();
      obj2.start();

        // Thread class has start() but Runnable interface doesnt have start()
        //for Runnable interface we need to make object of Thread and pass obj of class in it
        Thread t1 = new Thread(obj1);
        Thread t2 = new Thread(obj2);
        t1.start();
        t2.start();
    }
}
