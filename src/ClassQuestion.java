import java.util.Scanner;

class Square{
    int side;
    int area;
    int perimeter;
    public void setSide(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the side of the square: ");
        side = sc.nextInt();
    }
    public void getArea(){
        area = side*side;
        System.out.println("Area of the square is: "+area);
    }
    public void getPerimeter(){
        perimeter = 4*side;
        System.out.println("Perimeter of the square is: "+perimeter);
    }
}

public class ClassQuestion {
    public static void main(String[] args) {
        Square sq = new Square();
        sq.setSide();
        sq.getArea();
        sq.getPerimeter();
    }
}
