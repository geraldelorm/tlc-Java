package com.optionals;

import java.lang.reflect.Array;
import java.math.BigDecimal;
import java.util.*;

public class Main {
    public static Map<String, String> capitals = new HashMap<>();

    public static Map<String, Integer> populations = new HashMap<>();


    public static void main(String[] args) {

        Trade trade = new Trade("MS", null, new BigDecimal("25.0"));

//        System.out.println(trade.getQuantity().toString());


        Processor pro = new Processor();
        Optional<Integer> val1 = Optional.of(1);
        Optional<Integer> val2 = Optional.of(2);

        System.out.println("p.calc(val1, val2): " + pro.calc(val1,val2));

        Optional<Integer> val3 = Optional.ofNullable(null);
        System.out.println("p.calc(val1, val2): " + pro.calc(val3,val2));


        capitals.put("UK", "London");
        capitals.put("USA", "Washington DC");
        capitals.put("India", "New Delhi");

        populations.put("London", 8_000_000);
        populations.put("Washington DC", 6_000_000);
        populations.put("Beijing", 20_000_000);

        System.out.println(capitals.get("UK"));
        System.out.println(capitals.get("China"));

        System.out.println(getCap("UK"));
        System.out.println(getCap("China"));

        System.out.println(getCap("USA").map(s -> s.toUpperCase()));
        System.out.println(getCap("UK").map(String::toUpperCase));
        System.out.println(getCap("China").map(String::toUpperCase));
        System.out.println(getCap("China").map(String::toUpperCase).orElse("China Unavailable"));


        System.out.println(getCap("UK").flatMap(Main::getPop));
        System.out.println(getCap("China").flatMap(Main::getPop).orElse(0));


//        Object val = Optional.ofNullable("Hello")
//                .orElseGet(() ->"default value");

        List<Integer> values = Arrays.asList(1,-4,-3,4, -10, 11, 0);
        System.out.println(safeLargest(values));

        List<Integer> empty = Arrays.asList();
        System.out.println(safeLargest(empty).orElse(0));
    }

    public static Optional<String> getCap (String key) {
        return Optional.ofNullable(capitals.get(key));
    }

    public static Optional<Integer> getPop (String key) {
        return Optional.ofNullable(populations.get(key));
    }

    public static Optional<Integer> safeLargest(List<Integer> l) {
        return l.stream()
                .sorted((x,y) -> y -x)
                .findFirst();
    }

}
