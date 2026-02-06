package demo;

public class Child extends Parent{
    // child = subclass
    //parent = superclass
    // extends keyword is used to inherit the properties of the parent class. 
    // or we may say child can access the non private member of the parent class.
    // without extend it is not the subclass.
    public static void main(String[] args) {
        Child obj = new Child(); // object of child class, through inheritance "obj" can access the default, protected and public members of the parent.
        // private only accessible inside the parent.
        //System.out.println(obj.a); // error will occur because a is private and can only be accessed within the parent class.  
        System.out.println(obj.b); // b is default so it is accessible within the same package and subclass.
        System.out.println(obj.c); // c is protected so it is accessible within the same package and subclass.
        System.out.println(obj.d);// d is public so it is accessible from anywhere.
    }
} 
    
