package partTwoAlgoritmezation;

/**
 * Training: Introduction to Java (EPAM)
 *
 * 02. Algoritmization.
 *     01. Arrays.
 *
 * Problem 8:
 *   Дана последовательность целых чисел n a ,a , ,a 1 2  .
 *   Образовать новую последовательность, выбросив из исходной те члены,
 *   которые равны min( , , , ) 1 2 n a a  a .
 *
 *  @version 1.01   08/29/2022
 * @author MarkSuertudo
 */
import java.util.Random;

public class ArraysProblemEight {
    public static void main(String[] args) {
        Random rnd = new Random();
        int[] arr = new int[100];

        for (int i = 0; i < 100; i++) {
            arr[i] = rnd.nextInt();
        }

        int min = arr[0];
        for (int i = 0; i < 100; i++){
            if (arr[i] < min){
                min = arr[i];
            }
        }

        for(int i = 0; i < 100; i++){
            if (arr[i] == min){
                System.out.println("WWW");
            }
        }
    }
}
