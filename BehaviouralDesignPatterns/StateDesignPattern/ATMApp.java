package BehaviouralDesignPatterns.StateDesignPattern;

public class ATMApp {
    public static void main(String[] args) {
        ATM atm = new ATM();

        // proper sequence!
        atm.insertCard();
        atm.insertPIN();
        atm.withdrawMoney();
        System.out.println();
        // 
        atm.insertPIN();
        atm.withdrawMoney();
        System.out.println();
        // 
        atm.insertCard();
        atm.withdrawMoney();
        System.out.println();
        
        // proper sequence!
        atm.insertCard();
        atm.insertPIN();
        atm.withdrawMoney();

    }
    
}
