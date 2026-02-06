package samepackage;

public class ClassA {
    private int a =10;
    int b = 20; // b is default so it is accessible within the same package.
    protected int c = 30; // c is protected so it is accessible within the same package and subclass.
    public int d = 40; // d is public so it is accessible from anywhere.
}
