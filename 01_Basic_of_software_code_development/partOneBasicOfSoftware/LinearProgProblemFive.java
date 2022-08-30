package partOneBasicOfSoftware; /**
 * Training: Introduction to Java (EPAM)
 *
 * 01. Basic of software code development.
 *     01. Линейные программы. (Linear program: straightforward execution).
 *
 * Problem 5:
 *   Дано натуральное число Т, которое представляет длительность прошедшего
 *   времени в секундах.
 *   Вывести данное значение длительности в часах, минутах и секундах
 *   в следующей форме:   ННч ММмин SSсек (НН:ММ:SS).
 *
 * @version 1.01   08/29/2022
 * @author MarkSuertudo
 */

import java.util.Scanner;

public class LinearProgProblemFive {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int time = sc.nextInt();

        int seconds = time % 60;
        int hours  =  time / 3600;
        int minutes = (time)/60 - hours*60;
        System.out.printf("%d hours %d minutes %d seconds", hours, minutes, seconds);
    }
}
