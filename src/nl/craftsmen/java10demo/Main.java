package nl.craftsmen.java10demo;

import java.util.*;
import java.util.stream.Collectors;

/**
 * Demonstration of Java 10's new language and API capabilities
 */
public class Main {

    public static void main(String[] args) {
        var stringList = List.of("a", "b", "c");
        var stringMap = Map.of("key1", "b");
        var intSet = Set.of(1,2,3);

        Java9Demonstrator.demonstrate(stringList,stringMap, intSet);
        Java10Demonstrator.demonstrate(stringList,stringMap, intSet);
    }








}
