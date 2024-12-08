abstract class pen{
    abstract void write();
    abstract void refill();
}

class fountainPen extends pen{
    @Override
    void write() {
        System.out.println("Writing with a fountain pen");
    }

    @Override
    void refill() {
        System.out.println("refilling a fountain pen");
    }
    void changeNib(){
        System.out.println("Changing nib of fountain pen");
    }
}
public class QuestionsAbstractAndInterface {
    public static void main(String[] args) {
        fountainPen pen1 = new fountainPen();
        pen1.changeNib();
        pen1.refill();
        pen1.write();
    }
}
