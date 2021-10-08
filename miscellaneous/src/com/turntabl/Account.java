package com.turntabl;

public class Account {
    private int balance;

    public Account (int balance) {
        if (balance < 0){
            throw new IllegalArgumentException("initial balance cannot be nagative");
        }

        this.balance = balance;
    }

    public int getBalance() {
        return balance;
    }

    public  int withdrawal(int withdrawalAmount) throws OverdrawnException{
        if (balance < withdrawalAmount){
            throw new OverdrawnException("Balance no enough");
        }else {
            int newBal = balance - withdrawalAmount;
            return newBal;
        }
    }
}
