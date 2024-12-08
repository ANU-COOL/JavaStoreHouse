class MyThreadRunnable1 implements Runnable{
    @Override
    public void run() {
        int i = 0;
        while(i<20000){
            System.out.println("I am a thread");
            i++;
        }
    }
}

class MyThreadRunnable2 implements Runnable{
    @Override
    public void run() {
        int i = 0;
        while(i<20000){
            System.out.println("I am a thread in class 2");
            i++;
        }
    }
}

public class RunnableInterfaces {
    public static void main(String[] args) {
        // in runnable class we can't use objects t1 and t2 instead we have to make threads to implement these classes.
        MyThreadRunnable1 bullet1 = new MyThreadRunnable1();
        Thread gun1 = new Thread(bullet1);
        MyThreadRunnable2 bullet2 = new MyThreadRunnable2();
        Thread gun2 = new Thread(bullet2);
        gun1.start();
        gun2.start();
    }
}
