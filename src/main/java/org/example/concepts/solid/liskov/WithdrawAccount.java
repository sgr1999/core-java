package org.example.concepts.solid.liskov;

public interface WithdrawAccount extends DepositAccount{

    public void withdrawAmount(int amount);
}
