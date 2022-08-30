package partOneBasicOfSoftware; /**
 * Training: Introduction to Java (EPAM)
 *
 * 01. Basic of software code development.
 *     01. Линейные программы. (Linear program: straightforward execution).
 *
 * Problem 6:
 *   Для данной области составить линейную программу, которая печатает true,
 *   если точка с координатами (х, у) принадлежит закрашенной области (координаты
 *   заданы заранее), и false — в противном случае:
 *
 * @version 1.01 08/29/2022
 * @author MarkSuertudo
 *
 * CUIDADO : la solucion nesesite ser probada
 */

import java.util.Scanner;

public class LinearProgProblemSix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter coordinats x y: ");
        int x = sc.nextInt();
        int y = sc.nextInt();

        System.out.println( ((x >= -4 && x <= 4) && (y <= 0 && y >= -3)) ||
                            ((x >= -2 && x <= 2) && (y >= 0 && y <= 4 )));
    }
}
