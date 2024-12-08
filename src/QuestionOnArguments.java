public class QuestionOnArguments {
    static int sum(int...arr){
        int res = 0;
        int i = 0;
        for(int a : arr){
            res = res+a;
            i++;
        }
        return res/i;
    }
    public static void main(String[] args) {
        int avg = sum(1,2,3,4,5);
        System.out.println("Average of the numbers given as arguments is: " + avg);
    }
}
