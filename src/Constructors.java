//Constructors: A member function used to initialize ab object while creating it.

class Student{
    private int id;
    private String name;
    public Student(String myName, int myId){
        id = myId;
        name = myName;
    }
    public String getName(){
        return name;
    }
    public String setName(String n){
        name = n;
        return name;
    }
    public int getId(){
        return id;
    }
    public int setId(int i){
        id = i;
        return id;
    }
}
public class Constructors {
    public static void main(String[] args) {
        Student anusha = new Student("Anusha Sharma", 13);
        System.out.println(anusha.getName());
        System.out.println(anusha.getId());
        System.out.println(anusha.setName("Chirag Sharma"));
        System.out.println(anusha.setId(10));
    }
}
