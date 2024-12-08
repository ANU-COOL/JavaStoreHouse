class MyEmployee{
    private int id;
    private String name;
    public String getName(){
        return name;
    }
    public void setName(String n){
        name = n;
    }
    public int getId(){
        return id;
    }
    public void setId(int i){
        id = i;
    }
}
public class AccessModifiers {
    public static void main(String[] args) {
        MyEmployee anusha = new MyEmployee();
        //anusha.id = 1;
        //anusha.name = "Anusha Sharma"; --> Shows an error due to private access modifier.
        anusha.setName("Anusha");
        System.out.println(anusha.getName());

    }
}
