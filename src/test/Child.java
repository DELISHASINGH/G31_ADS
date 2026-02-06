package test;
import demo.Parent; // import the Parent class from demo package.
public class Child extends Parent{
    

    public static void main(String[] args) {
        Child obj = new Child(); //object of subclass. private members are not accessible outside parent. 
        // and deafut is also not accessible because child is in differnt package.
        //System.out.println(obj.a); // error will occur because a is private and can only be accessed within the parent class.  
        //System.out.println(obj.b); // error will occur because b is default and can only accessed within the same package and subclass.
        System.out.println(obj.c); 
        System.out.println(obj.d);// d is public so it is accessible from anywhere.
    }
}

//Because there are TWO different ways people try to access protected, and only one is allowed.
//CASE 1: WRONG (will NOT work)
// 1. Accessing via Parent reference
//Parent obj = new Parent();
//System.out.println(obj.c); // ❌ ERROR (different package)
//Even inside a subclass, this is NOT allowed.

// CASE 2: CORRECT (will work)
// 2. Accessing via Child reference
//Child obj = new Child();
//System.out.println(obj.c); // ✅ WORKS
//This is the ONLY allowed way in a different package.
