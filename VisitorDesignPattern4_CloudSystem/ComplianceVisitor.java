package VisitorDesignPattern4_CloudSystem;

public class ComplianceVisitor implements Visitor{
    @Override
    public void visit(Storage storage) {
        System.out.println(storage.name+" "+storage.sub_id+" "+storage.capacityGB+ "compliance sec restricted Strorage.");
    }

    @Override
    public void visit(VM vm) {
        System.out.println(vm.name+" "+vm.subID+" "+vm.size+ " compliance sec restricted VM.");
    }

    @Override
    public void visit(Compute compute) {
        System.out.println(compute.name+" "+compute.subId+" "+compute.vcpus+ " compliance sec restricted Compute.");
    }

    @Override
    public void visit(Vault vault) {
        System.out.println(vault.name+" "+vault.sub_id+ "compliance sec restricted vault");
    }
}
