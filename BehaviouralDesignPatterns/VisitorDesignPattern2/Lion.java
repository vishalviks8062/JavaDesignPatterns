package BehaviouralDesignPatterns.VisitorDesignPattern2;

public class Lion extends CagedAnimals{

    Lion(String name, String type){
        this.name = name;
        this.type = type;
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }
    
    
}
