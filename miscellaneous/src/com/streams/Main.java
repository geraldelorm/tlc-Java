package com.streams;

import java.math.BigDecimal;
import java.util.*;
import java.util.stream.Collectors;

import static java.util.Comparator.comparing;

public class Main {
    public static void main(String[] args) {
            List<Trade> trades = new ArrayList<>();
            trades.add(new Trade("MS", 30, new BigDecimal("25.0")));
            trades.add(new Trade("TESLA", 10, new BigDecimal("5.0")));
            trades.add(new Trade("IBM", 40, new BigDecimal("59.0")));
            trades.add(new Trade("APPL", 80, new BigDecimal("250.0")));


            List<String> symbols =
                    trades.stream()
                    .map(trade -> trade.getSymbol())
                    .collect(Collectors.toList());

        System.out.println(symbols);

        Map<String, Integer> map = trades.stream()
                .collect(Collectors.toMap(
                        p -> p.getSymbol(),
                        p -> p.getQuantity()
                ));

        System.out.println(map);


        List<String> highVolumeTrades = trades.stream()
                .filter(trade -> trade.getQuantity() > 20)
                .map(trade -> trade.getSymbol())
                .sorted()
                .map(t -> t.toLowerCase())
                .collect(Collectors.toList());

        System.out.println(highVolumeTrades);

        trades.stream()
                .map(Trade::getSymbol)
                .forEach(System.out::println);


        List<List<Trade>> listofTrades = Arrays.asList(trades, trades);

        System.out.println(listofTrades);

        listofTrades.stream()
                .flatMap(tradesList -> tradesList.stream())
                .collect(Collectors.toList())
                .forEach(System.out::println);

        long count = listofTrades.stream()
                .flatMap(trade -> trade.stream())
                .count();

        System.out.println(count);

        List<Trade> sortedTrades = trades.stream()
                .sorted(comparing(Trade::getPrice))
                .collect(Collectors.toList());

        System.out.println(sortedTrades);

        int totalQuantityOfTrades = trades.stream()
                .map(trade -> trade.getQuantity())
                .reduce(0, (a,b) -> a + b);

        System.out.println(totalQuantityOfTrades);
    }
}
