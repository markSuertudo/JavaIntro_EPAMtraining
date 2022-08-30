package partTwoAlgoritmezation;

/**
 * Training: Introduction to Java (EPAM)
 *
 * 02. Algoritmization.
 *     01. Arrays.
 *
 * Problem 3:
 *    Дан массив действительных чисел, размерность которого N.
 *    Подсчитать, сколько в нем отрицательных, положительных
 *    и нулевых элементов.
 *
 * @version 1.01   08/29/2022
 * @author MarkSuertudo
 */

import java.util.Random;

public class ArraysProblemThree {
    public static void main(String[] args) {
        Random rnd = new Random();

        double[] arr = new double[1000];

        for (int i = 0; i < 1000; i++){
            arr[i] = rnd.nextDouble(-100000000000.00, 10000000000000.0);
        }

        int negative = 0;
        int positive = 0;
        int zero = 0;

        for ( int i = 0; i < 1000; i++){
            if (arr[i] < 0){ negative++; }
            else if (arr[i] > 0){ positive++; }
            else { zero++; }
        }
        System.out.printf("negative %d positive %d zero %d\n",
                                        negative, positive, zero);
    }
}
