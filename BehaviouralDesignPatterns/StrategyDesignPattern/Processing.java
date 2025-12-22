package BehaviouralDesignPatterns.StrategyDesignPattern;

public class Processing {
    Payment payment;
    Processing(Payment payment){
        this.payment = payment;
    }

    void processPayment(){
        payment.payment();
    }
}