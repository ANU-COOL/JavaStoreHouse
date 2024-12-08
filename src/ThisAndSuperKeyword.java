// 'this' is a reference that is used to refer to the properties of an object.
// 'this' is a way for us to refer an object of the class which is being referred.
// 'super' is keyword used to refer to the immediate parent class object, instance variable, methods and constructors.
class EkClass{
    int a;
    public int getA(){
        return a;
    }
    EkClass(int a){
        // if we write 'a = a', it will give some random value as it will get confused but by using this we give a reference and pass a's value to a
        this.a = a;
    }
    public int returnOne(){
        return 1;
    }
}
class DoClass extends EkClass{
    DoClass(int c){
        super(c);
        System.out.println("I am a constructor in class DoClass with value "+ c + ".");
    }
}
public class ThisAndSuperKeyword {
    public static void main(String[] args) {
        EkClass e = new EkClass(20);
        System.out.println(e.getA());
        DoClass d = new DoClass(10);
    }
}
