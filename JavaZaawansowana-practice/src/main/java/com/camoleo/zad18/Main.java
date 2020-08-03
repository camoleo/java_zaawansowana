package com.camoleo.zad18;

public class Main {
    public static void main(String[] args) {

        Computer computer = new Computer("Intel Core i9", 4, "AMD PowerColor", "Apple", "Air i5-5350U");
        Computer computer2 = new Computer("Intel Core i5", 3, "AMD PowerColor", "Apple", "Air i5-5350U");
        Computer computer3 = new Computer("Intel Core i5", 3, "AMD PowerColor", "Apple", "Air i5-5350U");

        System.out.println(computer.toString());
        System.out.println(computer.equals(computer2));
        System.out.println(computer2.equals(computer3));
        System.out.println(computer.hashCode());


    }
}
// jak equals jest true to hash code też musi być true, a jak hash code true to equals nie musi być