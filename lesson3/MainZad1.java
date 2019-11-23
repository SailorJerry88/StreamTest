package pl.sda.rafal.zientara.game.lesson3;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class MainZad1 {
    public static void main(String[] args) {


        List<Integer> liczby = Arrays.asList(1, 3, 4, 10, 9, 13, 6);
        List<Integer> exampleOne = liczby.stream()
                .filter(l -> l % 2 != 0)
                .map(d -> d * 100)
                .collect(Collectors.toList());
        System.out.println(exampleOne);



    }


}
