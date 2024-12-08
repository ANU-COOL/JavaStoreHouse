import java.util.Scanner;

public class MethodsInJava {
    //Methods is an alternative name for functions.
    //We separate the logic of main method to other methods to reduce the size of the program
    //It follows the principle of DRY(Don't Repeat Yourself)
    static int logic(int x, int y){
        int z;
        if(x>y){
            z = x+y;
        }else{
            z = (x+y)*5;
        }
        return z;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of x:");
        int x = sc.nextInt();
        System.out.println("Enter the value of y:");
        int y = sc.nextInt();
        int z = logic(x,y);
        int p = logic(x-4, y+6);
        System.out.println(z);
        System.out.println(p);
    }
}
