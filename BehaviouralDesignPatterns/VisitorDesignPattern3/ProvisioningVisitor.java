package BehaviouralDesignPatterns.VisitorDesignPattern3;

public class ProvisioningVisitor implements Visitor {

    @Override
    public void visit(Vm vmVisitor) {
        System.out.println(vmVisitor.name + " : VM Provisioning");
    }

    @Override
    public void visit(Storage storageVisitor) {
        System.out.println(storageVisitor.name + " : Storage Provisioning");
    }

    @Override
    public void visit(LoadBalancer loadBalancer) {
        System.out.println(loadBalancer.name + " : loadBalancer Provisioning");
    }
    
}
