package org.example.concepts.solid.liskov;

public class SavingAccount implements WithdrawAccount{
    private int accountAmount;
    public SavingAccount(int accountAmount){
        this.accountAmount = accountAmount;
    }

    @Override
    public void depositAmount(int amount) {
        accountAmount += amount;
        System.out.println("In Saving Account amount has been Deposited = "+amount);
        System.out.println("Current Account Balance is = "+accountAmount);
    }

    @Override
    public void withdrawAmount(int amount) {
        accountAmount -= amount;
        System.out.println("In Saving Account amount has been withdraw = "+amount);
        System.out.println("Current Account Balance is = "+accountAmount);
    }
}
