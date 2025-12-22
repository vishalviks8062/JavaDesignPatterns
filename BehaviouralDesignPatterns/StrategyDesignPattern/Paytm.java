package BehaviouralDesignPatterns.StrategyDesignPattern;

public class Paytm implements Payment{
    @Override
    public void payment() {
        System.out.println("Paid using Paytm");
    }   
}