package BehaviouralDesignPatterns.VisitorDesignPattern2;

public class ZooKeeper implements Visitor{
    String name;

    ZooKeeper(String name){
        this.name = name;
    }

    @Override
    public void visit(CagedAnimals animal) {
        System.out.println("feeds to "+ animal.name);
    }
}
