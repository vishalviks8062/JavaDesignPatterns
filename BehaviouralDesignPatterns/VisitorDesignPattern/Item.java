package BehaviouralDesignPatterns.VisitorDesignPattern;

abstract class Item {
    String name;
    double price;

    abstract void accept(Visitor visitor);
}
