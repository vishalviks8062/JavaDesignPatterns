package BehaviouralDesignPatterns.VisitorDesignPattern3;

public class Storage implements Resources{
    String name;

    Storage(String name){
        this.name = name;
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }
}
