import java.util.Scanner;

public class TaxCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float tax;
        System.out.println("Please enter your salary in lakh");
        float income = sc.nextFloat();
        if(income<2.5){
            tax = 0;
            System.out.printf("Your payable tax amount is Rs %.2f Lakh\n", tax);
        }
        else if(income>2.5 && income<5.0){
            tax = 0.05f*income;
            System.out.printf("Your payable tax amount is Rs %.2f Lakh\n", tax);
        }
        else if(income>5.0 && income<10.0){
            tax = 0.20f*income;
            System.out.printf("Your payable tax amount is Rs %.2f Lakh\n", tax);
        }
        else{
            tax = 0.30f*income;
            System.out.printf("Your payable tax amount is Rs %.2f Lakh\n", tax);
        }
    }
}
