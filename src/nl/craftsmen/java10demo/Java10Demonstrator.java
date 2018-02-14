package nl.craftsmen.java10demo;

import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

class Java10Demonstrator {

    static void demonstrate(List<String> stringList, Map<String,String> stringMap, Set<Integer> intSet) {
        System.out.println("Java 10 result:");
        simpleExamples();
        printLoops(stringList);
        collectionsDemo(stringList, stringMap, intSet);
    }

    private static void simpleExamples() {
        var text = "Hello, Java 10!";
        System.out.println(text);
        var textFromMethod = getName();
        System.out.println(textFromMethod);
    }

    private static void printLoops(List<String> stringList) {
        for (var element: stringList) {
            System.out.println(element);
        }
        for (var i = 0; i < 10; i++) {
            System.out.println(i);
        }
    }

    private static void collectionsDemo(List<String> stringList, Map<String, String> stringMap, Set<Integer> intSet) {
        var stringListCopy = List.copyOf(stringList);
        var stringMapCopy = Map.copyOf(stringMap);
        var intSetCopy = Set.copyOf(intSet);
        System.out.println(stringListCopy);
        System.out.println(stringMapCopy);
        System.out.println(intSetCopy);
        var unmodifiableIntSet = intSet.stream().collect(Collectors.toUnmodifiableSet());
        System.out.println(unmodifiableIntSet);
    }

    private static String getName() {
        return "Name";
    }
}
