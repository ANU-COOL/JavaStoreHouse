//An interface have two types of methods: static and default.
//Default methods enable us to add new functionalities to existing methods.
//This feature ensures backward compatibility while updating an interface.
//Classes implementing interfaces need not implement default methods.
//Interfaces can also use private methods for default methods.
//If we make private methods we can't use them directly in main program but we can call them through any other or default methods and then can use them.
interface MyCamera{
    void takeSnap();
    void recordVideo();
    private void greet(){
        System.out.println("Good Morning...");
    }
    default void record4KVideo(){
        //Can use private method here in its own interface.
        greet();
        System.out.println("Recording in 4K...");
    }
}

interface Wifi{
    String[] getNetworks();
    void connectToNetwork(String network);
}
class MyCellPhone{
    void callNumber(int Number){
        System.out.println("Calling Number "+ Number);
    }
    void pickCall(){
        System.out.println("Picking Call...");
    }
}
class MySmartPhone extends MyCellPhone implements MyCamera, Wifi{
    public void takeSnap(){
        System.out.println("Taking Snap...");
    }

    @Override
    public void recordVideo() {
        System.out.println("Recording Video...");
    }

    @Override
    public void record4KVideo() {
        System.out.println("Taking snap and recording video in 4K...");
    }

    @Override
    public String[] getNetworks() {
        System.out.println("Getting list of networks...");
        String[] networkList = {"anusha", "sharma", "raj", "sejal", "anjali"};
        return networkList;
    }

    @Override
    public void connectToNetwork(String network) {
        System.out.println("Connecting to "+ network);
    }
}
public class DefaultMethods {
    public static void main(String[] args) {
        MySmartPhone as = new MySmartPhone();
        as.record4KVideo();
        //Can't use it here as it is a private method
        //as.greet();
        String[] ac = as.getNetworks();
        for (String item : ac){
            System.out.println(item);
        }
    }
}
