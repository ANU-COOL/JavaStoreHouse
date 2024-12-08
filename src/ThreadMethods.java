class thr3 extends Thread{
    public thr3(String name){
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

public class ThreadMethods {
    public static void main(String[] args) {
        thr3 t1 = new thr3("anusha");
        thr3 t2 = new thr3("chirag sharma");
        t1.start();
        //When we write start for both the threads they start together if we want
        //that t1 should start first and then end and after that t2 should start we can use t1.join()
        try {
            t1.join();
        }
        catch (Exception e){
            System.out.println(e);
        }
        // we used try and catch because it maybe possible that we are waiting for t1 to finish but t1 is already killed so if there is any exception of this sort we will be able to solve it using try and catch.
        //In try we try to run the code and in catch we get the error and write the code that we want to get executed if error is there.

        t2.start();
    }
}
