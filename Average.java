package average;

import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Average {
    public static void main(String[] args) {
        System.out.println(calcAverage(3,2));
    }
    public static double calcAverage(int a, int b){
        return Stream.of(a,b).map(e ->(double)e/2 ).reduce(0.0, (c, d)-> c+d);
    }
}
