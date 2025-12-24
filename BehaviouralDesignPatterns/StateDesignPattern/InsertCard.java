package BehaviouralDesignPatterns.StateDesignPattern;

public class InsertCard implements ATMStates{
    ATM atm;

    InsertCard(ATM atm){
        this.atm = atm;
    }

    @Override
    public void insertCard() {
        System.out.println("Card is Inserted in ATM");
        atm.setState(atm.hasCardState);
    }

    @Override
    public void typePIN() {
        System.out.println("Insert Card in ATM first.");
    }

    @Override
    public void withdrawMoney() {
        System.out.println("Insert Card in ATM first.");
    }




    
}
