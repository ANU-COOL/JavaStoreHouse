import java.util.Scanner;

class Cylinder{
    private int radius;
    private int height;

    public void setHeight(int height) {
        this.height = height;
    }

    public int getHeight() {
        return height;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    public int getRadius(){
        return radius;
    }
}
public class ModifiersQuestions {
    public static void main(String[] args) {
        Cylinder a = new Cylinder();
        a.setHeight(9);
        int h = a.getHeight();
        System.out.println(h);
        a.setRadius(4);
        int r = a.getRadius();
        System.out.println(r);
        float volume = 3.14f*r*r*h;
        System.out.printf("Volume of the cylinder is %.2f", volume);
    }
}
