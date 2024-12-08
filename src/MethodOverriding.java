// In method overriding the inherited class (class B) can override any method defined in its parent class (class A)
//Here in this example method2() has been override by class B
// We can also see the blue arrows in the file at method two indicating that this method is overridden
// Why we use @override because the code works fine even without writing that?
// We use that because in future if we change the code in such a way that override finishes then @override will through an error. So, we will get to know whether methods are overridden or not.
// Lastly, do not confuse override with overloading. Overloading is when same method is used with same name within a class but have different arguments associated with them.
class A{
    public int num(){
        return 4;
    }
    public void method2(){
        System.out.println("I am method 2 of class A.");
    }
}

class B extends A{
    @Override
    public void method2(){
        System.out.println("I am method 2 of class B.");
    }
    public void method3(){
        System.out.println("I am method 3 of class B.");
    }
}
public class MethodOverriding {
    public static void main(String[] args) {
        A a = new A();
        a.method2();
        B b = new B();
        b.method2();
    }
}
