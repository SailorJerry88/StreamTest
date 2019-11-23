package pl.sda.rafal.zientara.game.lesson3;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

public class MainStrem {

    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(2,4);

        numbers.stream()
                .map(new Function<Integer, Double>() {
                @Override
                    public Double apply(Integer integer){
                    return integer / 2.; // 0.5
                    
                    // return integer as (.)
                    // 2.
                }



                })
                .collect(Collectors.toList());
    }
}
