// Dynamic Method Dispatch means that which method is run is dispatched dynamically at the runtime because object is formed during the runtime.
class Phone{
    public void greet(){
        System.out.println("Good Morning!");
    }
    public void name(){
        System.out.println("This is a nokia Phone.");
    }
}
class SmartPhone extends Phone{
    public void welcome(){
        System.out.println("Welcome!");
    }
    public void name(){
        System.out.println("This is a nokia Smart Phone.");
    }
}
public class DynamicMethodDispatch {
    public static void main(String[] args) {
        //You are able to make object of SuperClass referring to SubClass
        //You can't do the vice-versa, it will through an error.
        // Super obj = new sub();
        Phone nokia = new SmartPhone();
        //SmartPhone realMe = new Phone(); //Not allowed
        // Now the question is that nokia refers to both phone and smartphone
        // So the question is that if we write nokia.name(); what will it print? Phone's method or SmartPhone's method
        // method of object will get run not of the reference.
        nokia.name();
    }
}
