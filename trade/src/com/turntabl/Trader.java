package com.turntabl;

public class Trader {
    private String name;
    private Account account = new Account();

    public void addTrade(Trade trade){
        account.setTotalValue(trade.getPrice() * trade.getQuantity());
    }

    public Account getAccount() {
        return account;
    }
}
