package com.turntabl;

import java.time.LocalTime;

public abstract class Trade {
    private String id;
    private String symbol;
    private int quantity;
    private double price;
    private LocalTime dateTime;

    public Trade(String id, String symbol, int quantity, double price) {
        this.id = id;
        this.symbol = symbol;
        this.quantity = quantity;
        this.price = price;
    }

    public Trade(String id, String symbol, int quantity) {
        this.id = id;
        this.symbol = symbol;
        this.quantity = quantity;
    }

    protected Trade() {

    }

    @Override
    public String toString() {
        return "Trade{" +
                "id='" + id + '\'' +
                ", symbol='" + symbol + '\'' +
                ", quantity=" + quantity +
                ", price=" + price +
                '}';
    }

    public void setPrice(double price) throws Exception{
        if (price > 0){
            this.price = price;
        }
        else {
            throw new Exception("Positive Values Only");
        }
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public double getPrice() {
        return price;
    }





    public abstract double calcDividend();

    public static class BondTrade extends Trade{

        private final double dividend;

        public BondTrade(double dividend) {
            this.dividend = dividend;
        }

        @Override
        public double calcDividend() {
            return dividend;
        }
    }

    public static class FundTrade extends Trade{

        private final double percentage;
        private double dividend;

        public FundTrade(double percentage) {
            this.percentage = percentage;
        }

        @Override
        public double calcDividend() {
            dividend = percentage * getPrice();
            return dividend;
        }
    }
}