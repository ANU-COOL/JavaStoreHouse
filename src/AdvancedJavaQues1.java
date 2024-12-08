import java.util.ArrayList;

//create ana array list and store names of 10 students in it and print it using for loop.
public class AdvancedJavaQues1 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("anusha");
        list.add("anu");
        list.add("sha");
        list.add("anha");
        list.add("usha");
        list.add("sejal");
        list.add("ayush");
        list.add("ankit");
        list.add("ritik");
        list.add("riya");
        for(int i = 0; i < list.size(); i++){
            System.out.println(list.get(i));
        }
    }
}
