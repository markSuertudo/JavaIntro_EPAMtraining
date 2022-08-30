package partOneBasicOfSoftware; /**
 * Training: Introduction to Java (EPAM)
 *
 * 01. Basic of software code development.
 *     02. Ветвления. (Conditions).
 *
 * Problem 3:
 *   Даны три точки А(х1,у1), В(х2,у2) и С(х3,у3). Определить, будут ли они
 *   расположены на одной прямой.
 *
 * @version 2.01 08/29/2022
 * @author MarkSuertudo
 * CUIDADO: nesesita aprobar
 */

import java.util.Scanner;

public class ConditionsProblemThree {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Coordinates of first point");
        int x1 = sc.nextInt();
        int y1 = sc.nextInt();
        System.out.println("Coordinates of second point");
        int x2 = sc.nextInt();
        int y2 = sc.nextInt();
        System.out.println("Coordinates of third point");
        int x3 = sc.nextInt();
        int y3 = sc.nextInt();
        // maybe + c
        // Solution
        if ( (x3-x1)/(x2-x1) == (y3-y1)/(y2-y1) ){
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}
