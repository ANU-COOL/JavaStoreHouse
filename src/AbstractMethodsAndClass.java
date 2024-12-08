package com.company;

//Abstract method is a method that is declared without an implementation.
// abstract void moveTo(double x, double y)
//Abstract classes include abstract methods, then the class itself must be declared abstract.
//Abstract methods doesn't have a body.

abstract class abc{
    public abc(){
        System.out.println("I am a constructor of abc class.");
    }

    // saying hello is a particular way of greeting
    public void hello(){
        System.out.println("Hello");
    }

    //people can greet in many ways in different languages
    abstract public void greetings();
}


//either we have to override the abstract method of the abstract parent class or.....
class def extends abc{
    @Override
    public void greetings(){
        System.out.println("Good Morning.");
    }
}

//or we have to make the child or derived class abstract
abstract class ghi extends abc{
    public void exist(){
        System.out.println("I am a constructor of class ghi.");
    }
}

public class AbstractMethodsAndClass {
    public static void main(String[] args) {

    }
}

