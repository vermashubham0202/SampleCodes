package programlogic;
/*
18-Program to demonstrate Switch Case in Java.
 */

/**
 *
 * @author Shubham Verma
 */
public class SwitchDemo {

    public static void main(String args[]) {

        int num = 4;

        switch (num) {
            case 0:
                System.out.println("Zero");
                break;

            case 1:
                System.out.println("One");
                break;

            case 2:
                System.out.println("Two");
                break;

            case 3:
                System.out.println("Three");
                break;

            case 4:
                System.out.println("Four");
                break;

            case 5:
                System.out.println("Five");
                break;

            default:
                System.out.println("Number is greater then five.");
        }
    }
}
