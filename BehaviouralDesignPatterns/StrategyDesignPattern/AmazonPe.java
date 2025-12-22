package BehaviouralDesignPatterns.StrategyDesignPattern;

public class AmazonPe implements Payment {

    public void payment() {
        System.out.println("Paid using AmazonPay");
    }
}
