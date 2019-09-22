package com.javarush.task.task14.task1417;

public abstract class Money {
    private  double amount = 0.00;

    public double getAmount() {
        return amount;
    }

    public Money(double amount) {
        this.amount = amount;
    }




    public abstract String getCurrencyName();
}

