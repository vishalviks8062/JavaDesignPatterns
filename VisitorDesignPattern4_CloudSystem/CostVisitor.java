package VisitorDesignPattern4_CloudSystem;

public class CostVisitor implements Visitor{

    @Override
    public void visit(Storage storage) {
        System.out.println(storage.name+" "+storage.sub_id+" "+storage.capacityGB+ ": price "+ 20.12 + "/hr");
    }

    @Override
    public void visit(VM vm) {
        System.out.println(vm.name+" "+vm.subID+" "+vm.size+ ": price "+ 10.12 + "/hr");
    }

    @Override
    public void visit(Compute compute) {
        System.out.println(compute.name+" "+compute.subId+" "+compute.vcpus+ ": price "+ 8.90 + "/hr");
    }

    @Override
    public void visit(Vault vault) {
        System.out.println(vault.name+" "+vault.sub_id+ ": price "+ 20.12 + "/hr");
    }
    
}
