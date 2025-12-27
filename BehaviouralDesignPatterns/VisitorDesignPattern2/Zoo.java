package BehaviouralDesignPatterns.VisitorDesignPattern2;

public class Zoo {

    public static void main(String[] args) {
        Bear bear = new Bear("Panda Bear", "Herbivoros");
        Lion lion = new Lion("Buddhu Lion", "Carnivoros");

        Specatator specatator = new Specatator("Zoo Visior - vs 02");
        ZooKeeper zooKeeper = new ZooKeeper("Zookeeper - tr01");

        lion.accept(zooKeeper);
        lion.accept(specatator);
        bear.accept(zooKeeper);
        bear.accept(specatator);
        
    }
    
}
