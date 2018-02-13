package nl.craftsmen.java10demo;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {
        var text = "hoi";

        var stringList = List.of("a", "b", "c");
        var stringMap = Map.of("key1", "value1");
        var intSet = Set.of(1,2,3);
        var name = getName();
        var otherThing = getNull();

        System.out.println(otherThing);

        for (var element: stringList) {
            System.out.println(element);
        }

        for (var i = 0; i < 10; i++) {
            System.out.println(i);
        }

        var inferredMap = new HashMap<>();

        //won't work, no type can be determined
        //var x;

        //won't work, method reference
        //var name2 = Main::getName;

        //won't work, null reference
        //var nullValue = null;

        //won't work, array initializer
        //var stringArray = {1, 2};

        var stringListCopy = List.copyOf(stringList);
        var stringMapCopy = Map.copyOf(stringMap);
        var intSetCopy = Set.copyOf(intSet);
        var unmodifiableIntSet = intSet.stream().collect(Collectors.toUnmodifiableSet());
        System.out.println(text);
    }

    private static String getName() {
        return "John";
    }

    private static String getNull() {
        return null;
    }

}
