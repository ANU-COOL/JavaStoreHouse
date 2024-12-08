//Throw is used to throw an exception
//Throws is used to tell that this function can throw this kind of exception and the used need to handle it.
public class ThrowVsThrows {
    public static int divide(int a, int b) throws ArithmeticException{
        int result = a/b;
        return result;
    }
    public static void main(String[] args) {
        int c = divide(6,0);
        System.out.println(c);
    }
}
