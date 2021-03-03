package programlogic;
/*
04-Program to print ASCII values and their respective characters.
ASCII - American Standard Code for Information Interchange
ASCII Range : (0 - 127)
 */

/**
 *
 * @author Shubham Verma
 */
public class AsciiValues {

    public static void main(String args[]) {

        int i;
        for (i = 0; i <= 127; i++) {
            System.out.println(i + " : " + (char) i);
        }
    }
}
