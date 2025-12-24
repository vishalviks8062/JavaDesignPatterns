package BehaviouralDesignPatterns.VisitorDesignPattern;

interface Visitor {
    public void visit(Book book);
    public void visit(Electronic electronic);
}
