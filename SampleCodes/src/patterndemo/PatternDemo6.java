package patterndemo;
/*
27-Program to print below pattern.
    1
    2 2
    3 3 3
    4 4 4 4
    5 5 5 5 5
 */

/**
 *
 * @author Shubham Verma
 */
public class PatternDemo6 {

    public static void main(String args[]) {

        int i, j, n = 5;

        for (i = 1; i <= n; i++) {
            for (j = 1; j <= i; j++) {
                System.out.print(i + " ");
            }
            System.out.println("");
        }
    }
}
