import java.util.Scanner;

public class SpecificExceptionHandling {
    public static void main(String[] args) {
        int[] arr = new int[3];
        arr[0] = 10;
        arr[1] = 90;
        arr[2] = 50;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the array index");
        int index = sc.nextInt();
        System.out.println("Enter the number with which you want to divide the element");
        int num = sc.nextInt();
        try{
            System.out.println("Value at index entered is: "+arr[index]);
            System.out.println("Value after diving the element is :"+ arr[index]/num);
        }
        catch (ArithmeticException e){
            System.out.println("Process failed because of the reason: "+e);
        }
        catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Process failed because of the reason: "+e);
        }
        catch (Exception e){
            System.out.println("Process failed because of the reason: "+e);
        }
        System.out.println("Program ended");
    }
}
