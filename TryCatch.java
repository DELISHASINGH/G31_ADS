public class TryCatch {
    public static void main(String[] args) {
        try {
            int a = 10;
            int b = 0;
            int c = a/b;
            System.out.println("The result is:"+c);
        } catch ( ArithmeticException ae) {
            System.out.println("exception caught: " +ae);
        } finally{
            System.out.println("This will always execute");
        }
        System.out.println("The Program is ended");
    }
}
