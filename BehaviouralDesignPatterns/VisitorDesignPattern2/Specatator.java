package BehaviouralDesignPatterns.VisitorDesignPattern2;

public class Specatator implements Visitor {

    String name;

    Specatator(String name){
        this.name = name;
    }

    @Override
    public void visit(CagedAnimals animal) {
        System.out.println("Taks photo of "+ animal.name);
    }
    
}
