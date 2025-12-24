package BehaviouralDesignPatterns.VisitorDesignPattern;

public class StationaryShop {
    public static void main(String[] args) {
        Book alice = new Book("Alice is Wonderland", 350);
        Electronic powerbank = new Electronic("Samsung Powerbank", 2000);

        DiscountVisitor dv = new DiscountVisitor();
        PriceVisitor pv = new PriceVisitor();

        pv.visit(alice);
        pv.visit(powerbank);

        dv.visit(alice);
        dv.visit(powerbank);

        
    }   
    
}
