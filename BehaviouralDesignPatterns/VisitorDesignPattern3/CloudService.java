package BehaviouralDesignPatterns.VisitorDesignPattern3;

public class CloudService {
    public static void main(String[] args) {
        LoadBalancer lb = new LoadBalancer("LB -1");
        Vm vm = new Vm("VM -1 ");
        Storage storage = new Storage("Storage -1 ");

        ComplianceVisitor cv = new ComplianceVisitor();
        ProvisioningVisitor pv = new ProvisioningVisitor();
        CostEstimationVisitor cev = new CostEstimationVisitor();

        lb.accept(cev);
        lb.accept(cv);
        lb.accept(pv);
        System.out.println();

        vm.accept(cev);
        vm.accept(cv);
        vm.accept(pv);
        System.out.println();

        storage.accept(cev);
        storage.accept(cv);
        storage.accept(pv);
        System.out.println();
    }
    
}
