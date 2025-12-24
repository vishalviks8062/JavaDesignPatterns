package BehaviouralDesignPatterns.StateDesignPattern;

public class TypePIN implements ATMStates {

    ATM atm;

    TypePIN(ATM atm){
        this.atm = atm;
    }

    @Override
    public void insertCard() {
        System.out.println("Card already Inserted.");
    }

    @Override
    public void typePIN() {
        System.out.println("PIN inserted properly");
        atm.setState(atm.hasValidatedState);
    }

    @Override
    public void withdrawMoney() {
        System.out.println("Enter the PIN first.");
    }
    
}
