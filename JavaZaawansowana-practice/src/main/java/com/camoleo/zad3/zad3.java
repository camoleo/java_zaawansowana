package com.camoleo.zad3;

import java.util.HashMap;
import java.util.Map;


public class zad3 {
    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();
        map.put("Java", 18);
        map.put("Python", 1);
        map.put("PHP", 0);
        map.put("JavaScript", 0);

        print(map);
    }

    private static void print(Map<String, Integer> input) {

        int i = 0;
        for (Map.Entry<String, Integer> entry : input.entrySet()) {
            System.out.println("Klucz: " + entry.getKey() + ", Wartośc: " + entry.getValue() + ".");
            if (i == input.size() - 1) {
                System.out.print("Klucz: " + entry.getKey() + ", Wartość: " + entry.getValue());
            } else {
                System.out.print("Klucz: " + entry.getKey() + ", Wartość: " + entry.getValue());
            }
            i = i + 1;
        }
//            System.out.println("======");
//            input.forEach(key, value) -> System.out.println("klucz: " + key + ", Wartość: " + value);

    }
    //Collectors.joining  - dzieki niemu nie mamy przecinka na koncu
    //LineSeperator - zamias enterów

}


//https://javastart.pl/baza-wiedzy/klasy/interfejs-map