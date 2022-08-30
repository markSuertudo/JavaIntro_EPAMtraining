package partOneBasicOfSoftware; /**
 * Training: Introduction to Java (EPAM)
 *
 * 01. Basic of software code development.
 *     01. Линейные программы. (Linear program: straightforward execution).
 *
 * Problem 2:
 *    Вычислить значение выражения по формуле (все переменные
 *    принимают действительные значения):
 *     (b+Math.sqrt(b*b + 4*a*c))/(2*a) - Math.pow(a,3)*c + Math.pow(b, -2)
 * @version 1.01 08/28/2022
 * @author MarkSuertudo
 */
import java.util.Scanner;

public class LinearProgProblemTwo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double a = sc.nextDouble();
        double b = sc.nextDouble();
        double c = sc.nextDouble();
        double res = (b + Math.sqrt(b*b + 4*a*c))/(2*a) - Math.pow(a,3)*c
                     + Math.pow(b, -2);

        System.out.println("Result is : " + res);
        // TODO:Output formatting style like C
        System.out.printf("Result is %.2f", res);
        // Test with Python:
        // TODO: System.execute extern program
        // (b + (b*b + 4*a*c)**0.5))/(2*a) - c * a**3 + b**-2

    }
}
