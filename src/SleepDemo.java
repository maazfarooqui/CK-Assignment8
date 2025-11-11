//this is not part of the assignment and has been added to gitignore file to prevent further commits

class MyThread extends Thread {
    public void run() {
        System.out.println(Thread.currentThread().getName() + " is going to sleep  " + Thread.currentThread());
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            System.out.println(e);
        }
        System.out.println(Thread.currentThread().getName() + " woke up");
    }
}

public class SleepDemo {
    public static void main(String[] args) {
        MyThread t1 = new MyThread();
        MyThread t2 = new MyThread();

        t1.setName("Thread A");
        t2.setName("Thread B");

        t1.start();
        t2.start();
    }
}
