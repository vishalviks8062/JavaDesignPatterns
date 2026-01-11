package VisitorDesignPattern4_CloudSystem;

public class Compute implements Resource {
    String name;
    String subId;
    int vcpus;
    
    

    public Compute(String name, String subId, int vcpus) {
        this.name = name;
        this.subId = subId;
        this.vcpus = vcpus;
    }
    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }
    
    
}
