package partOneBasicOfSoftware; /**
 * Training: Introduction to Java (EPAM)
 *
 * 01. Basic of software code development.
 *     01. Линейные программы. (Linear program: straightforward execution).
 *
 * Problem 1:
 *     Найдите значение функции: z = ( (a – 3 ) * b / 2) + c.
 *
 * @version 1.01 08/28/2022
 */

import java.util.Scanner;

public class LinearProgProblemOne {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // TODO: add variables checking
        // Variant 1: read command-line arguments
        if (args.length == 4){
            double a = Double.parseDouble(args[1]);
            double b = Double.parseDouble(args[2]);
            double c = Double.parseDouble(args[3]);
            System.out.println("Result is " + ((a - 3) * b / 2) + c);

        // Variant 2: using float-points numbers
        } else {
            double a = sc.nextDouble();
            double b = sc.nextDouble();
            double c = sc.nextDouble();
            System.out.println("Result is " + ((a - 3) * b / 2) + c);
        }

        // Variant 3: using integer numbers
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        System.out.println("Result is " + ((a - 3) * b / 2) + c + " (int)");
    }
}
