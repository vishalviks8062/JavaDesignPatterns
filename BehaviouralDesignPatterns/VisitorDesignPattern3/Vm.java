package BehaviouralDesignPatterns.VisitorDesignPattern3;

public class Vm implements Resources {
    String name;

    public Vm(String name) {
        this.name = name;
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }

    
}
