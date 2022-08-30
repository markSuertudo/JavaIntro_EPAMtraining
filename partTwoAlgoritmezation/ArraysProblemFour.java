package partTwoAlgoritmezation;

/**
 * Training: Introduction to Java (EPAM)
 *
 * 02. Algoritmization.
 *     01. Arrays.
 *
 * Problem 3:
 *   Даны действительные числа а1 ,а2 ,..., аn . Поменять местами
 *   наибольший и наименьший элементы.
 *
 * @version 1.01   08/29/2022
 * @author MarkSuertudo
 */

import java.util.Random;

public class ArraysProblemFour {
    public static void main(String[] args) {
        Random rnd = new Random();

        double[] arr = new double[10];

        for (int i = 0; i < 10; i++){
            arr[i] = rnd.nextDouble(-100000000000.00, 10000000000000.0);
            System.out.println(arr[i]);
        }

        double min = arr[0]; int indexMin = 0;
        double max = arr[0]; int indexMax = 0;
        for (int i = 1; i < 10; i++){
            if (arr[i] > max) { max = arr[i]; indexMax = i; }
            if (arr[i] < min) { min = arr[i]; indexMin = i; }
        }
        arr[indexMax] = arr[indexMin];
        arr[indexMin] = max;

        for (int i = 0; i < 10; i++){
            System.out.println(arr[i]);
        }
    }
}

// TODO: here easy solution is.