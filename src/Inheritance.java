class base{
    int x;
    public int getX(){
        return x;
    }

    public void setX(int x) {
        System.out.println("I am in base class and setting X now.");
        this.x = x;
    }

    public void printMe(){
        System.out.println("Topic is Inheritance.");
    }
}

//by using 'extends', class derived will get all the properties and methods of class base.
class derived extends base{
    public int y;
    public int getY(){
        return y;
    }
    public void setY(int y){
        System.out.println("I am in derived class and setting y now.");
        this.y = y;
    }
}
public class Inheritance {
    public static void main(String[] args) {
        base b = new base();
        b.setX(4);
        System.out.println(b.getX());

        //Using objects of class 'base' for class 'derived'
        derived d = new derived();
        d.setX(5);
        System.out.println(d.getX());

        //If we want to use Y in base class then we cant use because we can't use subclass's function in superclass but can do the opposite.
        //Only public variables of the superclass can be accessed by the subclass, private variables can only be accessed by the class in which they are formed.
    }
}
