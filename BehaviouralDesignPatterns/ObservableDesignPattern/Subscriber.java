package BehaviouralDesignPatterns.ObservableDesignPattern;

public class Subscriber implements Observer {
    String name;
    String Id;

    Subscriber(String name, String id){
        this.name = name;
        this.Id = id;
    }

    @Override
    public void notifyObserver(String Title, String channel) {
        System.out.println("Hi "+ name + " : New Video added in rthe channel : "+channel+ " # Title : "+ Title );
    }
}
