package partOneBasicOfSoftware; /**
 * Training: Introduction to Java (EPAM)
 *
 * 01. Basic of software code development.
 *     01. Линейные программы. (Linear program: straightforward execution).
 *
 * Problem 3:
 *     Вычислить значение выражения по формуле (все переменные принимают
 *     действительные значения):
 *      Math.sin(x) + Math.cos(y) / Math.cos(x) - Math.sin(y) * Math.tg(x*y)
 *
 */

import java.util.Scanner;

public class LinearProgProblemThree {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print(" Enter two angles in degrees : ");
        double x = sc.nextDouble();
        double y = sc.nextDouble();

        //NOTA: see more
        //      https://docs.oracle.com/en/java/javase/17/docs/api/java.base/java/lang/Math.html#method-summary
        x = Math.toRadians(x);
        y = Math.toRadians(y);
        double res = ((Math.sin(x) + Math.cos(y)) / (Math.cos(x) - Math.sin(y))) * Math.tan(x*y);
        System.out.printf("Result is : %.4f", res);

        //TEST: Python 3.9
        //    import math
        //    x = math.radians(80)
        //    y = math.radians(90)
        //
        //    res = (math.sin(x) + math.cos(y)) / (math.cos(x) - math.sin(y)) * math.tan(x*y)
        //    print(res)
        //    >>>  1.6607195157830035
    }
}
