import java.util.Scanner;

class NegativeRadiusException extends Exception{
    @Override
    public String toString() {
        return "Radius can not be negative";
    }

    @Override
    public String getMessage() {
        return "Radius can not be negative";
    }
}
public class CustomExceptions {
    //We will make a function to compute area of a circle but we don't want the radius to be negative so if the user enters a negative value of radius we will make our own exception and throw it
    public static double area() throws NegativeRadiusException{
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of the radius: ");
        int r = sc.nextInt();
        if(r<0){
            throw new NegativeRadiusException();
        }
        double area = Math.PI*r*r;
        return area;
    }
    public static void main(String[] args) {
        //Now as you have already told the user that this function can throw an error so the function
        //will not work without try catch as it knows that exception can be thrown.
        try {
            double c = area();
            System.out.println(c);
        }
        catch (Exception e){
            System.out.println(e);
        }
    }
}
