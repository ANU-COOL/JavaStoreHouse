import java.util.ArrayDeque;


//Array deque is an array in which insertion and deletion can be done from both sides.
public class Arraydeque {
    public static void main(String[] args) {
        //This constructs a deque of initial capacity 16.
        ArrayDeque<Integer> dq = new ArrayDeque<>();
        //This creates a deque with initial capacity 32
        ArrayDeque<Integer> dq1 = new ArrayDeque<>(32);
        //adding elements;
        dq.add(23);
        dq.add(43);
        dq.add(7);
        dq.add(45);
        dq.add(32);
        dq1.add(71);
        dq1.add(47);
        dq1.add(39);
        //Adding all elements of dq1
        dq.addAll(dq1);
        //operations in first
        dq.offerFirst(4);
        dq.pollFirst();
        dq.peekFirst();
        //operations from last
        dq.offerLast(34);
        dq.pollLast();
        dq.peekLast();
    }
}
