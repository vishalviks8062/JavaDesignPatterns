package BehaviouralDesignPatterns.VisitorDesignPattern;

public class Book extends Item {
    Book(String name, double price){
        this.name = name;
        this.price = price;
    }

    @Override
    void accept(Visitor visitor) {
        visitor.visit(this);
    }
}
