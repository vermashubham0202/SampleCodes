package factandtricks;
/*
05-Program to use printf in Java.
 */

/**
 *
 * @author Shubham Verma
 */
public class PrintfJava {

    public static void main(String args[]) {

        int num1 = 3, num2 = 5, sum;
        sum = num1 + num2;
        System.out.println("Sum of " + num1 + " and " + num2 + " is : " + sum);
        System.out.printf("Sum of %d and %d is : %d", num1, num2, sum);
    }
}
