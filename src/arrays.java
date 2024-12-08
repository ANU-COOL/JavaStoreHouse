import java.util.Scanner;

public class arrays {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        //creating an array

        //1
        int[] marks;                          //declaration
        marks = new int[5];                   //memory allocation

        //2
        int[] roll = new int[5];              //declaration + memory allocation

        //3
        int[] age = {10, 20, 30, 40, 50};     //declaration + initialization


        //Getting elements into an array
        int a = 90;
        for(int i = 0; i < 5; i++){
            marks[i] = a+i;
        }


        //Accessing elements of the array
        for(int i = 0; i < 5; i++){
            System.out.println(marks[i]);
        }
    }
}
