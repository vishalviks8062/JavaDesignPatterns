package BehaviouralDesignPatterns.VisitorDesignPattern2;

abstract class CagedAnimals {
    String name;
    String type;

    abstract void accept(Visitor visitor);
}
