package BehaviouralDesignPatterns.VisitorDesignPattern3;

public class CostEstimationVisitor implements Visitor{

    public void visit(Vm vmVisitor) {
        System.out.println(vmVisitor.name + " : VM CostEstimation");
    }

    @Override
    public void visit(Storage storageVisitor) {
        System.out.println(storageVisitor.name + " : Storage CostEstimation");
    }

    @Override
    public void visit(LoadBalancer loadBalancer) {
        System.out.println(loadBalancer.name + " : LoadBalancer CostEstimation");
    }
    
}
