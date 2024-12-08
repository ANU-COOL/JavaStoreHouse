import java.util.Scanner;
public class StringQuestions {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //problem1
        System.out.println("Please enter your name: ");
        String name = sc.nextLine();
        System.out.printf("Dear %s thanks a lot.", name);


        //problem2
        //detect double and tripple spaces in a string
        System.out.println("Enter a string with double and tripple spaces: ");
        String str = sc.nextLine();
        System.out.println(str.indexOf("  "));
        System.out.println(str.indexOf("   "));

    }
}
