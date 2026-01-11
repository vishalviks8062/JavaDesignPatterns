package VisitorDesignPattern4_CloudSystem;

interface Visitor {
    public void visit(Storage storage);
    public void visit(VM vm);
    public void visit(Compute compute);
    public void visit(Vault vault);
}
