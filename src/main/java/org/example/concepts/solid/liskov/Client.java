package org.example.concepts.solid.liskov;

public class Client {

    public static void main(String[] args) {

        WithdrawAccount saving = new SavingAccount(100);
        WithdrawAccount current = new CurrentAccount(100);
        DepositAccount deposit = new FixedDepositAccount();

        saving.withdrawAmount(5);
        saving.depositAmount(50);
        current.depositAmount(10);
        current.withdrawAmount(50);
        deposit.depositAmount(100);
    }
}
