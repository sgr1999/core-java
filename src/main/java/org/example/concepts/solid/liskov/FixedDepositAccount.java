package org.example.concepts.solid.liskov;

public class FixedDepositAccount implements DepositAccount{
    private int accountAmount;

    @Override
    public void depositAmount(int amount) {
        accountAmount += amount;
        System.out.println("In Fixed Deposit Account amount has been Deposited = "+amount);
        System.out.println("Fixed Deposit Account Balance is = "+accountAmount);
    }
}
