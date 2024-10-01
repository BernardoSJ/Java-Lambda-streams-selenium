import java.util.Comparator;
import java.util.Optional;
import java.util.stream.Stream;

public class TestStreamOf {

    public static void main(String[] args) {
        String a = "Ball";
        String b = "Delta";
        String c = "Apple";

        /*System.out.println(
                Stream.of(a, b, c)
                        .min(Comparator.naturalOrder())
        );*/

        Optional<String> smallest = getSmallest(a, b, c);

        if(smallest.isPresent()){
            System.out.println(smallest.get());
        }else{
            System.out.println("No value found");
        }
    }

    private static Optional<String> getSmallest(String var1, String var2, String var3){

        //algo.to find smallest
        return Stream.of(var1,var2,var3)
                .min(Comparator.naturalOrder());
    }
}
