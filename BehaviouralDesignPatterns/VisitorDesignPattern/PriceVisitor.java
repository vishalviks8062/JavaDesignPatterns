package BehaviouralDesignPatterns.VisitorDesignPattern;

public class PriceVisitor implements Visitor{

    @Override
    public void visit(Book book) {
        System.out.println("Book name: "+book.name + " => price : "+book.price);
    }

    @Override
    public void visit(Electronic electronic) {
        System.out.println("Book name: "+electronic.name + " => price : "+electronic.price);
    }
}
