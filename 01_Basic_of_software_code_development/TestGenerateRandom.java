import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class TestGenerateRandom {
    public static void main(String[] args) {
        System.out.println("Test Math.random() (generate value in range [0.0..1.0])");
        // TEST 1. Generate pseudorandom numbers in range [0.0..1.0) By default.
        for (int i = 0; i < 10; i++){
            System.out.println( Math.random() );
        }
        // TEST 2. From documentation
        double x1 = -10.0;
        double  x2 = 10.0;
        for (int i = 0; i < 10; i++){
            double f = Math.random()/Math.nextDown(1.0);
            double x = x1*(1.0 - f) + x2*f;
            System.out.println(x);
        }
        // TEST 3. Generate pseudorandom integers numbers in range [1..10]
        int min = 1;
        int max = 10;
        int range = max - min + 1;
        for (int i = 0; i < 10; i++){
            System.out.println( (int)(Math.random()*range)+min );
        }
        System.out.println("Test Random ");
        Random rnd = new Random();
        for (int i = 0; i < 10; i++){
            System.out.println(rnd.nextInt(-10, 10));
        }

        System.out.println("Test ThreadLocalRandom ");
        for (int i = 0; i < 10; i++){
            System.out.println( ThreadLocalRandom.current().nextDouble() );
        }
    }
}
