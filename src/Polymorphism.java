//When a class have multiple functionalities, but we want the user to use only some specific functionalities and hide others from the user.
//e.g. A smartphone has a feature camera, GPS, cell phone, media player, etc. but we want user to use the smartphone as camera only, so we will hide the other functionalities from the user till it's using camera.
// Camera c = new SmartPhone();

interface MyCamera2{
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

interface Wifi2{
    String[] getNetworks();
    void connectToNetwork(String network);
}
class MyCellPhone2{
    void callNumber(int Number){
        System.out.println("Calling Number "+ Number);
    }
    void pickCall(){
        System.out.println("Picking Call...");
    }
}
class MySmartPhone2 extends MyCellPhone2 implements MyCamera2, Wifi2{
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
public class Polymorphism {
    public static void main(String[] args) {
        MyCamera2 cam = new MySmartPhone2(); //This is a smartphone but please use it as camera only.
        Wifi2 w = new MySmartPhone2(); //This is a smartphone but please use it only for wifi.
        //cam.getNetwork(); --> Not allowed as you can only use camera and get networks is a method of wifi.
        cam.record4KVideo();
    }
}
