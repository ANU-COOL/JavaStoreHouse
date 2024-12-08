import java.util.Scanner;

public class MultiDimensionalArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of rows:");
        int n = sc.nextInt();
        System.out.println("Enter number of columns:");
        int m = sc.nextInt();
        int[][] arr = new int[n][m];
        System.out.println("Enter the element for the given info where elemnt is for arr[row][column].");
        for(int i = 0; i < n; i++){
            for(int j = 0; j < m; j++){
                System.out.printf("Enter the element you want at arr[%d][%d]\n",i, j);
                int el = sc.nextInt();
                el = arr[i][j];
            }
        }
    }
}
