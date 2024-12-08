import java.util.Scanner;
//didn't use static this time as we want to create object with having its own logic
public class CallingMethodsUsingObjects {
    int logic(int x, int y){
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

        //Calling method using objects
        CallingMethodsUsingObjects obj = new CallingMethodsUsingObjects();
        int z = obj.logic(x,y);
        int p = obj.logic(x-4, y+6);
        System.out.println(z);
        System.out.println(p);
    }
}
