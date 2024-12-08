import java.util.Scanner;

public class Recursion {
    static int factorial(int n){
        if(n == 0 || n == 1){
            return 1;
        }
        else{
            return n*factorial(n-1);
        }
    }
    public static void main(String[] args) {
        //Calling of a function by itself is called as recursion
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number whose factorial you want to find out: ");
        int n = sc.nextInt();
        int fact = factorial(n);
        System.out.printf("Factorial of number %d is %d", n, fact);
    }
}
