import java.util.Scanner;
public class UserInput {
    public static void main(String[] args) {
        System.out.println("Taking input from user:");
        Scanner sc = new Scanner(System.in);

        //sum of two numbers given by the user as input
        System.out.println("Enter the first number:");
        int a = sc.nextInt();
        System.out.println("Enter the second number:");
        int b = sc.nextInt();
        int sum = a+b;
        System.out.print("Sum of the numbers is: ");
        System.out.print(sum);



        //check validity of the given number whether it is an integer or not
        boolean b1 = sc.hasNextInt();
        System.out.print(b1);



        //taking string as input
        //if we enter "Anusha is a good girl" it will only print "Anusha" i.e. it ignores every string after one space
        String s = sc.next();
        System.out.println(s);
        //if we enter "Anusha is a good girl" it will print "Anusha is a good girl"
        String str = sc.nextLine();
        System.out.println(str);
    }
}
