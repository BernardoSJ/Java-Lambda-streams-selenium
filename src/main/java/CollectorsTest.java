import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class CollectorsTest {

    public static void main(String[] args) {
        List<String> list =new ArrayList<>();
        list.add("Apple");
        list.add("Apple");
        list.add("Airplane");
        list.add("Ball");
        list.add("Boy");
        list.add("Cat");
        list.add("Dog");
        list.add("Delta");

       /* Set<String> newSet = list.stream()
                                    .filter(s -> s.length() > 3)
                                    .collect(Collectors.toSet());

        System.out.println("Original List: "+list);
        System.out.println("New List: "+newSet);

        String joinedString = list.stream()
                .filter(s -> s.length() > 3)
                .collect(Collectors.joining(";"));
        System.out.println(joinedString);*/

        Map<Integer, List<String>> map = list.stream()
                                                .collect(Collectors.groupingBy(s -> s.length()));

        System.out.println(map);

        Stream<String> stream = list.stream()
                                        .filter(s -> s.length() > 3);
        stream.forEach(s -> System.out.println(s));
        stream.forEach(s -> System.out.println(s.toUpperCase()));
    }

}
