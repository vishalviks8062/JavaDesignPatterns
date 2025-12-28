package BehaviouralDesignPatterns.VisitorDesignPattern3;

public class LoadBalancer implements Resources{
    String name;

    public LoadBalancer(String name) {
        this.name = name;
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }
}
