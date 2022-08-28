/**
 * Training: Introduction to Java (EPAM)
 *
 * Description : Найдите значение функции: z = ( (a – 3 ) * b / 2) + c.
 */

import java.util.Scanner;

public class ProblemOne {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // TODO: add variables checking
        // Variant 1: read command-line arguments
        if (args.length == 3){
            double a = Double.parseDouble(args[0]);
            double b = Double.parseDouble(args[1]);
            double c = Double.parseDouble(args[2]);
            System.out.println("Result is " + (((a - 3) * b / 2) + c) );

        // Variant 2: using float-points numbers
        } else {
            double a = sc.nextDouble();
            double b = sc.nextDouble();
            double c = sc.nextDouble();
            System.out.println("Result is " + (((a - 3) * b / 2) + c) );
        }

        // Variant 3: using integer numbers
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        System.out.println("Result is " + (((a - 3) * b / 2) + c) + " (int)");
    }
}
