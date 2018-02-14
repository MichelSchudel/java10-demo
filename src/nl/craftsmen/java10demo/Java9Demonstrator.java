package nl.craftsmen.java10demo;

import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

class Java9Demonstrator {

    static void demonstrate(List<String> stringList, Map<String,String> stringMap, Set<Integer> intSet) {
        System.out.println("Java 9 result:");
        simpleExamples();
        printLoops(stringList);
        collectionsDemo(stringList, stringMap, intSet);
    }

    private static void simpleExamples() {
        String text = "Hello, Java 9!";
        System.out.println(text);
        String textFromMethod = getName();
        System.out.println(textFromMethod);
    }

    private static void printLoops(List<String> stringList) {
        for (String element: stringList) {
            System.out.println(element);
        }
        for (int i = 0; i < 10; i++) {
            System.out.println(i);
        }
    }

    private static void collectionsDemo(List<String> stringList, Map<String, String> stringMap, Set<Integer> intSet) {
        List<String> stringListCopy = Collections.unmodifiableList(stringList);
        Map<String, String> stringMapCopy = Collections.unmodifiableMap(stringMap);
        Set<Integer> intSetCopy = Collections.unmodifiableSet(intSet);
        System.out.println(stringListCopy);
        System.out.println(stringMapCopy);
        System.out.println(intSetCopy);
        Set<Integer> unmodifiableIntSet = Collections.unmodifiableSet(intSet.stream().collect(Collectors.toSet()));
        System.out.println(unmodifiableIntSet);
    }

    private static String getName() {
        return "Name";
    }
}
