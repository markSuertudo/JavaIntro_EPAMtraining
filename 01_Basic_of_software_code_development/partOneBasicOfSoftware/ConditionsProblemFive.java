package partOneBasicOfSoftware;

/**
 * Training: Introduction to Java (EPAM)
 *
 * 01. Basic of software code development.
 *     02. Ветвления. (Conditions).
 *
 * Problem 5:
 *   Вычислить значение функции:
 *               | x*x - 3*x +9 , if x <= 3;
 *       F(x) = <
 *               \ 1/(x*x*x + 6), if x > 3;
 * @version 1.01 08/29/2022
 * @author MarkSuertudo
 */

public class ConditionsProblemFive {
    public static void main(String[] args) {
        // Generate pseudorandom float-point number
        double x1 = -100;
        double x2 = 100;
        double f = Math.random()/Math.nextDown(1.0);
        double x = x1*(1.0 - f) + x2*f;

        // Solution :
        if (x <= 3) {
            System.out.printf("Result is %.2f\n", (x * x - 3 * x + 9));
        } else {
            System.out.printf("Result is %.2e\n", 1/(x*x*x + 6) );
        }
    }
}
