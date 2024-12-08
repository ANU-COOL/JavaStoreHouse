import java.util.Scanner;

public class SumUsingRecursion {
    static int sum(int n){
        if(n == 1){
            return 1;
        }
        else{
            return (n+sum(n-1));
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of natural numbers you want to add: ");
        int n = sc.nextInt();
        int ans = sum(n);
        System.out.printf("Sum of %d natural numbers is %d", n, ans);
    }
}
