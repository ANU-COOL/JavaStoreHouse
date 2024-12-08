class base1{
    //constructor of base class
    base1(){
        System.out.println("I am a base class constructor.");
    }
    base1(int a){
        System.out.printf("I am a base class constructor with value %f", a);
    }
    int x;
    public int getx(){
        return x;
    }
    public void setX(int x) {
        this.x = x;
    }
}

class derived1 extends base1{
    derived1(){
        //By default it will run the base constructor that doesn't require any argument.
        //But if we want to run the base constructor that has an argument we need to use the keyword super(argument);
        super(10);
        System.out.println("I am a derived class constructor.");
    }
    int y ;

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }
}


public class ConstructorsInInheritance {
    public static void main(String[] args) {
        //If we call derived class constructor the base class constructor and the derived class constructor both will be called but at first the base class constructor will be called.
        derived1 d = new derived1();
    }
}
