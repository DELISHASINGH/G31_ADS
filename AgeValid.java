public class AgeValid {
//     public → This class can be accessed from anywhere.
// class → We are creating a class.
// AgeValid → Name of the class.
// { → Start of the class body.
    public static void main(String[] args) {
        int age = 5; //We declare an integer variable age. we assign value 5.
        try {  //try block is used to write code that might cause an exception.
            if(age<18){
                throw new ArithmeticException("Age is not eligible for the vote"); 
                // Checking condition: If age is less than 18.
                // Since age = 5, condition is TRUE.
                // throw → Used to manually create an exception.
                // new ArithmeticException(...) → Creating an exception object.
                // "Age is not eligible for the vote" → Custom error message.
            }  //End of if block
            System.out.println("You are eligible for the vote");
            // This line will NOT execute.
            // Why? Because exception was thrown above. When exception occurs, remaining code inside try block is skipped.
        } catch (ArithmeticException e) { //catch block handles the exception. ArithmeticException e → Catching that specific exception.
            System.out.println("Exception: "+e.getMessage());  //e.getMessage() → Returns the custom message.
        } //End of catch block.
    } //End of main method.
} //End of class.

