//If we want method1 and method2 to be there in chileInterface, if we write those methods again we will not be able to obey the DRY principle.
//So to obey that principle inheritance is introduced in interfaces
//Interface can be implemented in a class but interface can't be extended from a class.
//Interface abc extends bec............where bec is an interface....this is correct.
//Class abc extends bec..........where bec is an interface......this is not correct.
//Class abc implements bec........where bec is an interface.........this is also correct.
//If we implement sample interface in child sample class...it is compulsory to define bodies of methods of sample i.e. method1 and method2.
//We implemented childSample in class demo so, method 3 and method 4 should have been compulsory to implement but method 1 and method 2 were also compulsory and this happened due to inheritance in interfaces.
interface sample{
    void method1();
    void method2();
}

interface childSample extends sample{
    void method3();
    void method4();
}

class demo implements childSample{
    @Override
    public void method3() {
        System.out.println("Method 3");
    }

    @Override
    public void method4() {
        System.out.println("Method 4");
    }

    @Override
    public void method1() {
        System.out.println("Method 1");
    }

    @Override
    public void method2() {
        System.out.println("Method 2");
    }
}

public class InheritanceInInterfaces {
    public static void main(String[] args) {
        demo obj = new demo();
        obj.method1();
        obj.method2();
        obj.method3();
        obj.method4();
    }
}
