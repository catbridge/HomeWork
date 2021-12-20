package Home_Work_2.arrays;

import java.util.Arrays;
import java.util.Random;

public class ArrayUtils1 {

    public static int[] arrayRandom(int size, int maxValueExclusion){
        Random rnd = new Random();
        int [] container = new int[5];
        for (int i = 0; i < size; i++) {
            container[i] = rnd.nextInt(99);
        }
        return container;

    }
}
