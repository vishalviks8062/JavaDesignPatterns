package BehaviouralDesignPatterns.VisitorDesignPattern;

public class DiscountVisitor implements Visitor {
    @Override
    public void visit(Book book) {
        System.out.println("Book name : "+ book.name + " : "+ (book.price*0.1 ) );
    }
    @Override
    public void visit(Electronic electronic) {
        System.out.println("Book name : "+ electronic.name + " : "+ (electronic.price *0.12));
    }
}
