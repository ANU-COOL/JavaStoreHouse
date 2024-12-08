import java.util.Scanner;

class InvalidInputException extends Exception{
    @Override
    public String toString() {
        return "Can not add 8 & 9";
    }
}
class DivideByZero extends Exception{
    @Override
    public String toString() {
        return "Can not divide by zero";
    }
}
class MaxInputException extends Exception{
    @Override
    public String toString() {
        return "Can not take input greater than 100000";
    }
}
class MaxMultiplierException extends Exception{
    @Override
    public String toString() {
        return "Multiplication result can not exceed 40000";
    }
}
class Calculator {
    double add (double a, double b) throws InvalidInputException, MaxInputException{
        if(a == 8 || b == 8 || a == 9 || b == 9){
            throw new InvalidInputException();
        }
        if(a>100000 || b>100000){
            throw new MaxInputException();
        }
        return a+b;
    }
    double sub(double a, double b)throws MaxInputException{
        if(a>100000 || b>100000){
            throw new MaxInputException();
        }
        return a-b;
    }
    double mul(double a, double b) throws MaxMultiplierException, MaxInputException{
        if(a>100000 || b>100000){
            throw new MaxInputException();
        }
        if(a*b > 40000){
            throw new MaxMultiplierException();
        }
        return a*b;
    }
    double div(double a, double b) throws DivideByZero, MaxInputException{
        if(b == 0){
            throw new DivideByZero();
        }
        if(a>100000 || b>100000){
            throw new MaxInputException();
        }
        return a/b;
    }
}
public class CustomCalculator {
    /*
    Create a custom calculator which have the following methods:
    1. add
    2. subtract
    3. multiply
    4. division
    which throws the following exceptions:
    1. invalid input exception
    2. cannot divide by zero exception
    3. max input exception(<100000)
    4. max multiplier reached exception (<40000)
     */
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) throws InvalidInputException, MaxMultiplierException, MaxInputException, DivideByZero {
        System.out.println("Enter the numbers you want to perform the operation on:");
        double a = sc.nextDouble();
        double b = sc.nextDouble();
        System.out.println("Choose the operation you want to perform: 1. add    2. subtract    3. multiply    4. divide");
        int operation = sc.nextInt();
        Calculator c = new Calculator();
        if(operation == 1){
            System.out.println(c.add(a,b));;
        }
        else if(operation == 2){
            System.out.println(c.sub(a,b));;
        }
        else if (operation == 3) {
            System.out.println(c.mul(a,b));;
        }
        else if(operation == 4){
            System.out.println(c.div(a,b));;
        }
    }
}
