import java.util.ArrayList;

public class Arraylist {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        System.out.println(list.size());
        for(int i = 0; i < list.size(); i++){
            System.out.println(list.get(i));
        }
        /* Other methoda of arraylist:
             l.clear();
             l.clone();
             l.contains(element e);
             l.add(index i, element e);
             if ArrayList<Integer> l = new ArrayList<>();
             l.addAll(l);
             l.indexOf(element e);
             l.remove(index i);
             l.remove(object o);
             l.lastIndexOf(element e);
         */
    }
}
