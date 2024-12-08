import java.util.Scanner;

public class WebsiteChecker {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter the website");
        String name = sc.nextLine();
        if(name.endsWith(".org")){
            System.out.println("Yes it's an organisational website.");
        }else{
            System.out.println("No, it's not an organisational website.");
        }
    }
}
