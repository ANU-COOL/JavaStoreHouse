/*
    There are four pillars of OOPS:
        1. Abstraction: Show only necessary information to the user and hide the underlying method description which is unnecessary to him.
        This can be done using abstract classes in which it's method tells us that what function is going to be performed and doesn't specify how it's going to be defined.
        2. Encapsulation: Process of wrapping the code and data together into a single unit. We make the variables private in a class
        so that they can't be accessed by some other class but make getters and setters to use and set their value.
        3. Inheritance: Process of one class inheriting methods and properties of another class. We have a parent class and a child class.
        class child extends parent
        4. Polymorphism: Poly means many and morph means forms. One method having different definitions. Two types of polymorphism is there:
          a. Static Polymorphism.
          b. Dynamic Polymorphism.
 */

// ABSTRACTION
abstract class car{
    public void applyBrakes(){}
}
class Honda extends car{
    @Override
    public void applyBrakes() {
        System.out.println("Brakes applied on car Honda..........");
    }
}

// ENCAPSULATION
class Bike{
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    //now test encapsulated classes in main
}

//INHERITANCE
class Scooter{
    public String wheelStatus;
    public int noOfWheels;
    public Scooter(int noOfWheels, String wheelStatus){
        this.wheelStatus = wheelStatus;
        this.noOfWheels = noOfWheels;
    }
    public void applyBrakes(){
        wheelStatus = "stop";
        System.out.println("Stop the car using break.");
    }

    @Override
    public String toString() {
        return ("No of wheels in Scooter " + noOfWheels + "/n" +  "wheel status " + wheelStatus);
    }
}
class Chetak extends Scooter{
    public Boolean alloyWheel;
    public Chetak(String wheelStatus, int noOfWheels, Boolean alloyWheel){
        super(noOfWheels, wheelStatus);
        this.alloyWheel = alloyWheel;
    }

    public void setAlloyWheel(Boolean alloyWheel) {
        this.alloyWheel = alloyWheel;
    }

    @Override
    public String toString() {
        return (super.toString() + "/n" + "Scooter alloy wheel" + alloyWheel);
    }
}

//POLYMORPHISM
class cycle{
    public void speed() {
    }

    public void speed(String accelerator) {
    }

    public int speed(String accelerator, int speedUp) {
        return speedUp;
    }
}



public class OOPSCocepts {
    public static void main(String[] args) {
        Bike bike = new Bike();
        bike.setName("Royal Enfield Bullet");
        System.out.println(bike.getName());
        Chetak chetak = new Chetak("Stop", 2, true);
        System.out.println(chetak.toString());
    }
}
