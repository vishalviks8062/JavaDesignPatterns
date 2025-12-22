package BehaviouralDesignPatterns.StrategyDesignPattern;

public class Client {
    public static void main(String[] args) {

       Processing process = new Processing(new AmazonPe());
       process.processPayment();

       process = new Processing(new Gpay());
       process.processPayment();

       process = new Processing(new PhonePe());
       process.processPayment();

       process = new Processing(new Paytm());
       process.processPayment();
    }
    
}
