//JVM maintains a ready queue of threads in queue to be run or executed.
class thr1 extends Thread{
    public thr1(String name){
        super(name);
    }
    @Override
    public void run() {
        int i = 0;
        while(i <= 10){
            System.out.println("Hi I am "+ this.getName());
            i++;
        }
    }
}
public class ThreadPriorities {
    public static void main(String[] args) {
        //Ready Queue: T1 T2 T3 T4 T5
        // priority scheduler in jvm is responsible for running this queue and provide cpu to each one of these threads
        // Three types of priority are there in java threads having their constant values:
        // MIN_PRIORITY = 1
        // NORM_PRIORITY = 5
        // MAX_PRIORITY = 10
        thr1 t1 = new thr1("anusha");
        thr1 t2 = new thr1("chirag");
        thr1 t3 = new thr1("viny");
        thr1 t4 = new thr1("anurag");
        thr1 t5 = new thr1("sejal");
        //Threads are being printed in any order.
        //If we want them to have a specific order we need to give then priority.
        t4.setPriority(Thread.MAX_PRIORITY);
        t1.setPriority(Thread.MIN_PRIORITY );
        t1.start();
        t2.start();
        t3.start();
        t4.start();
        t5.start();
    }
}
