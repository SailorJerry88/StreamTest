package pl.sda.rafal.zientara.game.lesson3;

import java.io.OutputStream;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class MainStrem {

    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(2,4,5);



        List<Integer> output = numbers.stream() Stream<Integer>
                .map(integer -> integer / 2.) Stream<Double>
                .map(aDouble -> aDouble * 2) Stream<Double>
                .filter(filtr -> filtr > 4)
                .collect(Collectors.toList());
        System.out.println(output);
    }
}
