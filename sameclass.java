// Defines a **public class** named `sameclass`.
// - `public` means this class can be accessed from **anywhere**.
// - Class name should ideally start with a capital letter (`SameClass`), but Java allows this too.
public class sameclass {

    private int a = 10;  //a is a private variable. private → accessible only inside this class. Value assigned: 10.
    int b = 20;            // default
    protected int c = 30;
    public int d = 40;

    // SAME CLASS
    public sameclass() { // Constructor of the class. Constructor name is same as the class name
        System.out.println("Same Class Access:");
        System.out.println(a); // private
        System.out.println(b); // default
        System.out.println(c); // protected
        System.out.println(d); // public
    }                       // End of constructor

    public static void main(String[] args) { //program execution start here. public → JVM can access it. static → no object needed to call main.String[] args → command-line arguments.
        new sameclass(); // Create an object of the smeclass to call the constructor and print the values.
    }
}
