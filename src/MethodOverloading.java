import java.util.Scanner;

public class MethodOverloading {
    //When there is nothing to return in the function we consider its return data type to be void.
    static void morning(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Hi! What's your name?");
        String name = sc.nextLine();
        System.out.printf("Good Morning! %s", name);
    }
    public static void main(String[] args) {
        morning();
    }
}
