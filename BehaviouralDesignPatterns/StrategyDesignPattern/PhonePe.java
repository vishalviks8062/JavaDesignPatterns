package BehaviouralDesignPatterns.StrategyDesignPattern;

public class PhonePe implements Payment{

    @Override
    public void payment() {
        System.out.println("paid using PhonePe");
    }

    
}
