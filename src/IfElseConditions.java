import java.util.Scanner;
public class IfElseConditions {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //voting problem
        System.out.println("Enter your age: ");
        int age = sc.nextInt();
        if(age>=18){
            System.out.println("Yes, you can vote.");
        }else{
            System.out.println("Sorry! you can not vote.");
        }




    }
}
