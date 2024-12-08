public class VarArgs {
    //In this the number of arguments stated in a method(function) are variable
    static int sum(int...arr){
        //available as int[] arr
        int res = 0;
        for(int a : arr){
            res = res + a;
        }
        return res;
    }

    public static void main(String[] args) {
        System.out.println("Sum of nothing is: " + sum());
        //The above written statement will return 0 as array will be empty and value of result is 0.
        System.out.println("The sum of 4 and 5 is: " + sum(4,5));
        System.out.println("The sum of 4, 5, and 6 is: " + sum(4,5,6));
        System.out.println("The sum of 4, 5, 6, and 10 is: " + sum(4,5,6,10));
    }
}
