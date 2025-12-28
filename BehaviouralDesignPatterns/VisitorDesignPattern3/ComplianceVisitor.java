package BehaviouralDesignPatterns.VisitorDesignPattern3;

public class ComplianceVisitor implements Visitor{

    @Override
    public void visit(Vm vmVisitor) {
        System.out.println(vmVisitor.name + " : VM compliance");
    }

    @Override
    public void visit(Storage storageVisitor) {
        System.out.println(storageVisitor.name + " : storageVisitor compliance");
    }

    @Override
    public void visit(LoadBalancer loadBalancer) {
        System.out.println(loadBalancer.name + " : loadBalancer compliance");
    }
    
}
