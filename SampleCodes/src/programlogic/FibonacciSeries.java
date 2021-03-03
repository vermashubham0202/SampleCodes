package programlogic;

import java.util.Scanner;

/*
28-Program to print Fibonacci series.
   Eg. 1    1   2   3   5   8   13  21  ... n
 */
/**
 *
 * @author Shubham Verma
 */
public class FibonacciSeries {

    public static void main(String args[]) {

        int a = 1, b = 1, n, temp = 0;

        // Taking input from user
        System.out.println("Enter a number : ");
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();

        System.out.print("1 1 ");

        temp = a + b;

        while (temp <= n) {
            System.out.print(temp + " ");
            b = a;
            a = temp;
            temp = a + b;
        }
        System.out.println("");
    }
}
