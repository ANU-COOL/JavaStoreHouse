class Person{
    int id;
    String name;
    //Creating method for the attributes
    public void printDetails(){
        System.out.println("My id is "+id);
        System.out.println("My name is "+name);
    }
}
public class CustomClass {
    public static void main(String[] args) {
        System.out.println("This is an example of custom class:");
        //Instantiating a new object
        Person anusha = new Person();
        Person anurag = new Person();
        Person sejal = new Person();
        //Setting attributes(properties) of the new object as per the format of the class.
        anusha.id = 13;
        anusha.name = "Anusha Sharma";
        anurag.id = 17;
        anurag.name = "Anurag tripathi";
        sejal.id = 76;
        sejal.name = "Sejal Jain";
        //Printing the attributes
        anusha.printDetails();
        anurag.printDetails();
        sejal.printDetails();
    }
}
