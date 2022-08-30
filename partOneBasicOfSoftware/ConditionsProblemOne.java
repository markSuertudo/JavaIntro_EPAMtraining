package partOneBasicOfSoftware; /**
 * Training: Introduction to Java (EPAM)
 *
 * 01. Basic of software code development.
 *     02. Ветвления. (Conditions).
 *
 * Problem 1:
 *   Даны два угла треугольника (в градусах). Определить, существует ли
 *   такой треугольник, и если да, то будет ли он прямоугольным.
 *
 * @version 1.01 08/29/2022
 * @author MarkSuertudo
 */

import java.util.Scanner;

public class ConditionsProblemOne {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter dos numbers ");
        double a = sc.nextDouble();
        double b = sc.nextDouble();

        if ( a+b < 180.0 ){
            System.out.println("Si, this triangle exists.");
            if ( a+b == 90.0 ) {
                System.out.println("Wow, It's right triangle");
            }
        } else {
            System.out.println("No such triangle exists");
        }
    }
}
