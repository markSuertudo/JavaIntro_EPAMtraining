package partOneBasicOfSoftware; /**
 * Training: Introduction to Java (EPAM)
 *
 * 01. Basic of software code development.
 *     02. Ветвления. (Conditions).
 *
 * Problem 2:
 *   Найти max(min(a, b), min(c, d)).
 *
 * @version 1.01 08/29/2022
 * @author MarkSuertudo
 */

import java.util.Random;

public class ConditionsProblemTwo {
    public static void main(String[] args) {
        Random rnd = new Random();
        int a =  rnd.nextInt(-100, 100);
        int b =  rnd.nextInt(-100, 100);
        int c =  rnd.nextInt(-100, 100);
        int d =  rnd.nextInt(-100, 100);
        System.out.printf("%d %d %d %d\n", a, b, c, d);
        // Use temporary variables.
        int x, y;
        if ( a < b ){ x = a; } else { x = b; }
        if ( c < d ){ y = c; } else { y = d; }
        if ( x < y ){ x = y; }
        System.out.println(x);

        // ...but following solution is more easier
        System.out.println( Math.max( Math.min(a,b), Math.min(c,d) ) );

        // ... and something complicated (brain *uck)
        x = (a < b ) ? a : b;
        y = (c < d ) ? c : d;
        System.out.println( ((x > y) ? x : y) );
    }
}
