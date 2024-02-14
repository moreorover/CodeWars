package kata.kyu8;

import java.util.stream.IntStream;

public class ClassResults {
    public static boolean betterThanAverage(int[] classPoints, int yourPoints) {
        return yourPoints > IntStream.of(classPoints).average().getAsDouble();
    }
}
