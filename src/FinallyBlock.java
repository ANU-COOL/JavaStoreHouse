// A block of code that is always executed whether the exception is handled or not.

public class FinallyBlock {
    public static int greet(){
        try{
            int a = 5;
            int b = 1;
            int c = a/b;
            return c;
        }
        catch (Exception e){
            System.out.println(e);
        }
        finally {
            System.out.println("This is the end of this program.");
        }
        return -1;
    }
    public static void main(String[] args) {
        //we got the statement "this is the end of the program" even after using return
        //After the program entered catch it was executed but still it printed the statement in finally because it will always get executed even if the program has returned some value previously.

        greet();
    }
}
