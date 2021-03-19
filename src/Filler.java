import java.util.Random;

public class Filler {

    public static final int MAX_VALUE = 20000;
    public static final int MIN_VALUE = -100;

    public static void filler(int[][] array) {
        Random random = new Random();
        for(int i = 0; i < array.length; i++) {
            for(int j = 0; j < array.length; j++) {
               array[i][j] = random.nextInt(MAX_VALUE) + MIN_VALUE;
            }
        }
    }
}
