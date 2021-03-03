package operatordemo;
/*
09-Interesting fact about Pre-Post Increment.
 */

/**
 *
 * @author Shubham Verma
 */
public class PrePostInteresting {

    public static void main(String args[]) {

        int i = 5;
        i = i++;
        /* int temp;
                       temp = i;
                       i++;
                       i = temp;
         */
        System.out.println(i);  //Output : 5

        i = ++i;
        /* int temp;
                       ++i;
                       temp = i;
                       i = temp;
         */
        System.out.println(i);  //Output : 6
    }
}
