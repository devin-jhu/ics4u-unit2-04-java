/*
 * The stack program
 *
 * By:      Devin Jhu
 * Version: 1.0
 * Since:   2022 10 31
 */

import java.util.Scanner;
/**
* Class Main.
*/

final class Main {
    /**
    * Prevent instantiation
    * Throw an exception IllegalStateException.
    * if this ever is called
    *
    * @throws IllegalStateException
    *
    */
    private Main() {
        throw new IllegalStateException("Cannot be instantiated");
    }

    /**
    * The stack program.
    *
    * @param args No args will be used
    */
    public static void main(final String[] args) {
        final Scanner myObj = new Scanner(System.in);
        // send to MrCoxallStack
        final MrCoxallStack aStack = new MrCoxallStack();
        final int tempElement;

        System.out.print("Enter number (type . to end loop): ");
        while (myObj.hasNext()) {
            final String myNewLine = myObj.nextLine();
            if (".".equals(myNewLine)) {
                break;
            }

            try {
                final int userNumber = Integer.parseInt(myNewLine);
                aStack.push(userNumber);
            } catch (NumberFormatException ex) {
                System.out.println(myNewLine + " is not a number");
            }
            System.out.print("Enter number(type . to end loop): ");
        }

        System.out.println(aStack.getStack());
        System.out.print("peeked value: ");
        System.out.println(aStack.peekStack());

        tempElement = aStack.pop();
        System.out.print("\nPopped value:");
        System.out.println(tempElement);

        aStack.clearStack();
        System.out.println("clearing");
        System.out.println(aStack.getStack() + " stack cleared");

        System.out.println("\nDone.");
    }
}
