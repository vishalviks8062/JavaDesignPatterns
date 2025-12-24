package BehaviouralDesignPatterns.VisitorDesignPattern;

public class Electronic extends Item{

    Electronic(String name, double price){
        this.name = name;
        this.price = price;
    }

    @Override
    void accept(Visitor visitor) {
        visitor.visit(this);
    }
    


    
}
