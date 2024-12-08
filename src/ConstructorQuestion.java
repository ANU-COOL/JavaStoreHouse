class Cylinders{
    private int radius;
    private int height;

    public Cylinders(int radius, int height) {
        this.radius = radius;
        this.height = height;
    }

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
public class ConstructorQuestion {
    public static void main(String[] args) {
        Cylinders a = new Cylinders(12, 5);
        int h = a.getHeight();
        System.out.printf("Height of cylinder is %d\n", h);
        int r = a.getRadius();
        System.out.printf("Radius of cylinder is %d\n", r);
        float volume = 3.14f*r*r*h;
        System.out.printf("Volume of the cylinder is %.2f", volume);

    }
}
