package Threads;

public class Multithreading_LambdaExpression {
    public static void main(String[] args) {
        // 1st way to write Lambda expression
        Runnable obj1 = new Runnable() {
            public void run() {
                for (int i = 0; i < 5; i++) {
                    System.out.print("Hi ");
                    try {
                        Thread.sleep(500);
                    } catch (Exception e) {}
                }
            }
        };
        // new way to write Lambda expression
        Runnable obj2 = () -> {

                for (int i = 0; i < 5; i++) {
                    System.out.print("PL ");
                    try {
                        Thread.sleep(500);
                    } catch (Exception e) {}
                }

        };
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
