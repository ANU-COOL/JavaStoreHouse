import javax.xml.transform.Source;
import java.util.Scanner;

public class TryCatch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int c = 0;
        System.out.println("Enter the value of dividend a: ");
        int a = sc.nextInt();
        System.out.println("Enter the value of divisor b: ");
        int b = sc.nextInt();
        //int c = a/b;    -> This statement will through an arithmetic exception as a/0 isn't defined.
        //Now as a programmer we know that these type of exceptions can come as user can enter a value 0 for b
        //So, we sat that try to run this statement and if you catch any exception then do the stated part,
        try{
            c = a/b;
        }
        catch (Exception e){
            System.out.println("We failed to divide.");
            System.out.println("Reason: "+e);
        }
        System.out.println("The result is: "+c);

    }
}
