package BehaviouralDesignPatterns.StateDesignPattern;

public class WithdrawMoney implements ATMStates{
    ATM atm ;

    WithdrawMoney(ATM atm){
        this.atm = atm;
    }

    @Override
    public void insertCard() {
        System.out.println("Card already inserted.");
    }

    @Override
    public void typePIN() {
        System.out.println("PIN already validated.");
    }

    @Override
    public void withdrawMoney() {
        System.out.println("Please collect Money! Card evicted successfully");
        atm.setState(atm.noCardState);
    }

    
}
