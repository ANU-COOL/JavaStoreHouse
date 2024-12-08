//In java string is a class but due to special support in java we can use string as data type.
//Strings are immutable and can not be changed.
// In memory, we can not change that object but we can make a copy of that string object and can change it there.
public class StringMethods {
    public static void main(String[] args) {
        String name = "Anusha";


        //length of the string
        int a = name.length();
        System.out.println(a);


        //lower case
        String lname = name.toLowerCase();
        System.out.println(lname);


        //Upper case
        String uname = name.toUpperCase();
        System.out.println(uname);


        //trim
        String mname = "    anusha    ";
        String tname = mname.trim();
        System.out.println(tname);


        //substring
        String sname = name.substring(1);
        System.out.println(sname);
        String ssname = name.substring(1,3);
        System.out.println(ssname);


        //replace
        String rname = name.replace('a', 'b');
        System.out.println(rname);


        //start and end check
        System.out.println(name.startsWith("An"));
        System.out.println(name.endsWith("s"));


        //character at the given index
        char pname = name.charAt(2);
        System.out.println(pname);


        //index of char
        int iname = name.indexOf('a');
        System.out.println(iname);


        //equality check
        System.out.println(name.equals("Anusha"));
        System.out.println(name.equalsIgnoreCase("anusha"));

        //last occurrence of character
        System.out.println(name.lastIndexOf('a'));
        System.out.println(name.lastIndexOf('a', 3));
    }
}
