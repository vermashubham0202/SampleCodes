package programlogic;
/*
21-Program to demonstrate 'break' statement.
 */

/**
 *
 * @author Shubham Verma
 */
public class BreakDemo {

    public static void main(String args[]) {

        System.out.println("Unlabeled Loop Output : ");
        
        for (int i = 1; i <= 4; i++) {
            for (int j = 1; j <= 4; j++) {
                if (i == 3) {
                    break;
                            /* unlabeled break statement.
                               It will break inner loop. */
                }
                System.out.print("* ");
            }
            System.out.println("");
        }
        
        System.out.println("Labeled Loop Output : ");
        
        outer:  //we are putting a label for outer loop
        for (int i = 1; i <= 4; i++) {
            for (int j = 1; j <= 4; j++) {
                if (i == 3) {
                    break outer;
                                  /* labeled break statement.
                                     It will break outer loop. */
                }
                System.out.print("* ");
            }
            System.out.println("");
        }
    }
}
