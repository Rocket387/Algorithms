package org.example.Recursion;

public class Factorial {

    public static int recursiveFactorial(int n) {

        //if condition important as defines whether recursiveFactorial calls itself or not
        //Recursive case
        if (n > 0) {
            System.out.println("Execution context: " + n);

            return n * recursiveFactorial(n - 1);
        }
        //base case (n == 0) (0! = 1)
        {
            return 1;
        }
    }

    public static void main(String[] args) {
        int recursiveSolution = recursiveFactorial(4);
        System.out.println(recursiveSolution);
    }
}
