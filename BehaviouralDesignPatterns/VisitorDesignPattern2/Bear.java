package BehaviouralDesignPatterns.VisitorDesignPattern2;

public class Bear extends CagedAnimals{
    
    Bear(String name, String type){
        this.name = name;
        this.type = type;
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }
    
}
