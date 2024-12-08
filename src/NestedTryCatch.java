import java.util.Scanner;

public class NestedTryCatch {
    public static void main(String[] args) {
        int[] arr = new int[3];
        arr[0] = 10;
        arr[1] = 90;
        arr[2] = 50;
        Scanner sc = new Scanner(System.in);
        boolean flag = true;
        while (flag){
            System.out.println("Enter the array index: ");
            int ind = sc.nextInt();
            try {
                System.out.println("Welcome to nested try catch file.");
                try {
                    System.out.println("Element at the given index is: "+arr[ind]);
                    flag = false;
                }
                catch (ArrayIndexOutOfBoundsException e){
                    System.out.println("This index doesn't exist");
                    System.out.println("Exception in level 2");
                }
            }
            catch (Exception e){
                System.out.println("Exception in level 1");
            }
        }
        System.out.println("The program has successfully ended.");
    }
}
