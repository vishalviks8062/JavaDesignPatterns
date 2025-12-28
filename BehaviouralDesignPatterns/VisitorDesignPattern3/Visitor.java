package BehaviouralDesignPatterns.VisitorDesignPattern3;

interface Visitor {

    public void visit(Vm vmVisitor);
    public void visit(Storage storageVisitor);
    public void visit(LoadBalancer loadBalancer);
}