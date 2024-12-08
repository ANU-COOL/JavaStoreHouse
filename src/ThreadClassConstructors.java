//four commonly used constructors in thread class are:
// 1. Thread()
// 2. Thread(String name)
// 3. Thread(Runnable r)
// 4. Thread(Runnable r, String name)
class thr extends Thread{
    public thr(String name){
        super(name);
    }

    @Override
    public void run() {
        int i = 0;
        while (i<3){
            System.out.println("I am a thread");
            i++;
        }
    }
}
public class ThreadClassConstructors {
    public static void main(String[] args) {
        thr t = new thr("Anusha Sharma");
        thr t2 = new thr("Chirag Sharma");
        t.start();
        t2.start();
        //we can get the id of each thread
        System.out.println("The id of this thread is "+ t.getId());
        System.out.println(t.getName());
        System.out.println(t.getClass());
        System.out.println("The id of this thread is "+ t2.getId());
        System.out.println(t2.getName());
        System.out.println(t2.getClass());
    }
}
