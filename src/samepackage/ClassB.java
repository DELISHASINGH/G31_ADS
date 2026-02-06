package samepackage;

public class ClassB {
    public static void main(String[] args){
        ClassA obj = new ClassA(); // this created an objest of classA. object can hold the access of non private variables. 
        // System.out.println(obj.a); // error will occur because 'a' is private and can only be accessed within ClassA
        System.out.println(obj.b);
        System.out.println(obj.c);
        System.out.println(obj.d);

    }
}