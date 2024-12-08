//import java.util.Scanner;
//if we want every package in util to be there we need to do import java.util.*
//import java.util.*;
//if we don't want to import the package scanner from util we can do the following change
//We used java.util package and Scanner class from the package.
public class Packages {
    public static void main(String[] args) {
        java.util.Scanner sc = new java.util.Scanner(System.in);
        System.out.println("Please enter your name.");
        String name = sc.nextLine();
        System.out.println("Your name is "+ name);
    }
}

