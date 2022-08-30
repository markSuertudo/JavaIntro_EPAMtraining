package partOneBasicOfSoftware; /**
 * Training: Introduction to Java (EPAM)
 *
 * 01. Basic of software code development.
 *     02. Ветвления. (Conditions).
 *
 * Problem 4:
 *   Заданы размеры А, В прямоугольного отверстия и размеры х, у, z кирпича.
 *   Определить, пройдет ли кирпич через отверстие.
 *
 * @version 1.01 08/29/2022
 * @author MarkSuertudo
 */

import java.util.Scanner;

public class ConditionsProblemFour {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();
        int z = sc.nextInt();

        int A = 10;
        int B = 20;
        int square = A * B;

        if ( x*y <= square || x*z <= square || y*z <= square ){
            System.out.println("Si, puede!");
        } else {
            System.out.println("No");
        }
    }
}
