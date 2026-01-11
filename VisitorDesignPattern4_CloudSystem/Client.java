package VisitorDesignPattern4_CloudSystem;

public class Client {
    public static void main(String[] args) {
        Compute compute = new Compute("compute1", "absc_123bhikgw_23mbhj", 1);
        VM vm = new VM("absc_123bhikgw_23mbhj", 2, "VM 1");
        Storage storage = new Storage("compute1", "absc_123bhikgw_23mbhj", 1);
        Vault vault = new Vault("vault 1","absc_123bhikgw_23mbhj", true, true );

        Visitor cv = new ComplianceVisitor();
        Visitor cost = new CostVisitor();

        compute.accept(cost);
        compute.accept(cv);

        System.out.println();

        vm.accept(cost);
        vm.accept(cv);

        System.out.println();

        storage.accept(cost);
        storage.accept(cv);

        System.out.println();

        vault.accept(cost);
        vault.accept(cv);

        System.out.println();
    }
    
}

