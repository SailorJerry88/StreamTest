package pl.sda.rafal.zientara.game.lesson3;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

public class MainZad2 {

    public static void main(String[] args) {

        List<String> txt = Arrays.asList( "ala", "samochód", "kot", "aleksandra", "pies", "azor");

        List<String> output = txt.stream()

                .filter(text -> text.startsWith("a") || text.startsWith("A"))
                .map(MainZad2::getStartsWithBigLetter(s)
                .collect(Collectors.toList());

        System.out.println(output);

        String test = "ola";
        if (test.contains("a")){
            System.out.println("zawiera aAa aAaaa A!");
        }
        if (test.startsWith("al")){
            System.out.println("Zaczyna się na allLL yyy LL");
        }

    @Override
    public String apply(String s){
        char firstLetter = s.charAt(0);
        firstLetter = Character.toUpperCase(firstLetter);
        String substring = s.substring(1);
        return firstLetter + substring;

    }


}
}
