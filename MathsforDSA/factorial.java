// More on Factorial : https://en.wikipedia.org/wiki/Factorial

public class factorial {

    // Driver Code
    public static void main(String[] args) {
        tests(); // Call the tests method to run factorial tests
    }

    //Test Cases 
    //More on Assert : https://www.geeksforgeeks.org/assertions-in-java/
    public static void tests() {
       assert fact(1) == 1;
       assert fact(5) == 120;
       assert fact(0) == 1;
       System.out.println("Successfully Passed Test Cases!"); // Successfull Message print
    }

    //Recursive method to calculate Factorial
    public static int fact(int n) {
        if(Character.isDigit(n) == false)
            return 0;
        if(n == 0)return 1; \
        return n * fact(n-1);
    }

}
