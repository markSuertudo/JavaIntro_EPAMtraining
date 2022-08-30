package partOneBasicOfSoftware; /**
 * Training: Introduction to Java (EPAM)
 *
 * 01. Basic of software code development.
 *     01. Линейные программы. (Linear program: straightforward execution).
 *
 * Problem 4:
 *   Дано действительное число R вида nnn.ddd (три цифровых разряда в дробной
 *   и целой частях).
 *   Поменять местами дробную и целую части числа и вывести полученное значение числа.
 *
 * @version  1.01 08.29.2022
 * @author MarkSuertudo
 */

import java.util.Scanner;

public class LinearProgProblemFour {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter any float-point number : ");
        double x = sc.nextDouble();
        double intPart = Math.floor(x);
        double floatPart = (x - intPart) * 1000;
        double res = floatPart  + intPart/1000;
        System.out.printf("Result is %.3f\n", res);

        // NOTA: I could use string operations (Podría usar operaciones de cadena)
        //
        //  #!/usr/bin/env python3
        //  s = input()  ## nnn.ddd
        //  print( s[4:]+'.'+s[:3]

        // NOTA: see https://www.geeksforgeeks.org/split-string-java-examples/
        sc.nextLine();
        String s = sc.nextLine();
        String[] parts = s.split("[.]",2);
        System.out.printf("%s.%s\n", parts[1], parts[0]);
    }
}
