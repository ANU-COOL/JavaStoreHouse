//Creating threads using extending thread class.
//Concurrency is the task of running and managing multiple computations at the same time.
//Parallelism is the task of running and managing multiple computations simultaneously.
class MyThread extends Thread{
    @Override
    public void run() {
        int i = 0;
        while(i<40000){
            System.out.println("Running MyThread");
            i++;
        }
    }
}
class MyThread2 extends Thread{
    @Override
    public void run() {
        int i = 0;
        while(i<40000){
            System.out.println("Running MyThread 2");
            i++;
        }
    }
}

public class Threads {
    public static void main(String[] args) {
        MyThread t1 = new MyThread();
        MyThread2 t2 = new MyThread2();
        //start method is used to call the methods of the thread.
        t1.start();
        t2.start();
        //when we see the output we can clearly see that processor is dividing  time between t1 and t2
        //It can not run t1 and t2 simultaneously.
        //Hence we can say that threads are based on concurrency.
    }
}

