package VisitorDesignPattern4_CloudSystem;

public class VM implements Resource{

    String subID;
    int size;
    String name;

    

    public VM(String subID, int size, String name) {
        this.subID = subID;
        this.size = size;
        this.name = name;
    }


    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }

    
}
