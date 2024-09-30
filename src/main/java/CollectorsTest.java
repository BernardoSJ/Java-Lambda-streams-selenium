import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

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

        Set<String> newSet = list.stream()
                                    .filter(s -> s.length() > 3)
                                    .collect(Collectors.toSet());

        System.out.println("Original List: "+list);
        System.out.println("New List: "+newSet);

        String joinedString = list.stream()
                .filter(s -> s.length() > 3)
                .collect(Collectors.joining(";"));
        System.out.println(joinedString);
    }

}
