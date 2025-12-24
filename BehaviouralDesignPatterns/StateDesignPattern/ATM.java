package BehaviouralDesignPatterns.StateDesignPattern;

public class ATM {

    ATMStates noCardState;
    ATMStates hasCardState;
    ATMStates hasValidatedState;
    ATMStates currentState;

    ATM(){
        noCardState = new InsertCard(this);
        hasCardState = new TypePIN(this);
        hasValidatedState = new WithdrawMoney(this);

        currentState = noCardState;
    }

    void setState(ATMStates state){
        this.currentState = state;
    }

    void insertCard(){
        this.currentState.insertCard();
    }

    void insertPIN(){
        this.currentState.typePIN();
    }

    void withdrawMoney(){
        this.currentState.withdrawMoney();
    }
    
}
