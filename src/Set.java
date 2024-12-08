import java.util.HashSet;
//set doesn't store duplicates
public class Set {
    public static void main(String[] args) {
        HashSet<Integer> s = new HashSet<>();
        s.add(1);
        s.add(2);
        s.add(3);
        s.add(4);
        s.add(5);
        s.add(2);
        s.add(3);
        System.out.println(s);
    }
}
