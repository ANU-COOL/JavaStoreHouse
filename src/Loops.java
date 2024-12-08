import java.util.Scanner;

public class Loops {
    public static void main(String[] args) {


        //While loop
        int i = 1;
        while(i<=5){
            System.out.println(i);
            i++;
        }


        //Infinite while loop
        // If we work in c/cpp while(1) or while(500), etc will work for creating a while loop but java has formed a constraint that while will take only boolean as expression
//        while(true){
//            System.out.println("anusha sharma");
//        }


        //do while loop
        int a = 10;
        do{
            System.out.println(a);
            a++;
        }while(a<5);


        //for loop
        //print first n odd numbers using a for loop
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of n:");
        int n = sc.nextInt();
        for(int c = 0; c<n; c++){
            System.out.println(2*c+1);
        }
    }
}
