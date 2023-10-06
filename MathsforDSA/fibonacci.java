// More on Fibonacci Series : https://en.wikipedia.org/wiki/Fibonacci_sequence
// This class calculates Fibonacci numbers using an iterative approach.
public class fibonacci{

    public static int fibonacci_sequence(int n) {

        int num1 = 0, num2 = 1, count = 0;
        if (n <= 1) {
        return n;
    }
        // Calculate the Fibonacci number iteratively
        while(count<n) {
            int swap = num1 + num2;
            num1 = num2;
            num2 = swap;
            count++;
        }
        return num1;
    }

    // test cases
    //More on Assert : https://www.geeksforgeeks.org/assertions-in-java/
    public static void tests() {

        int test_case1 = fibonacci_sequence(0);
        assert(test_case1 == 0);
        System.out.println("Test Case 1 Passed!");

        int test_case2 = fibonacci_sequence(5);
        assert(test_case2 == 3);
        System.out.println("Test Case 2 Passed!");

        int test_case3 = fibonacci_sequence(10);
        assert(test_case3 == 34);
        System.out.println("Test Case 3 Passed!");

        int test_case4 = fibonacci_sequence(15);
        assert(test_case4 == 377);
        System.out.println("Test Case 4 Passed!");

        int test_case5 = fibonacci_sequence(20);
        assert(test_case5 == 4181);
        System.out.println("Test Case 5 Passed!");


    }

    //Main method
    public static void main(String[] args) {
        tests();
    }
}