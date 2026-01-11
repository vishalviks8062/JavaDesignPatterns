package VisitorDesignPattern4_CloudSystem;

public class Storage implements Resource {

    String sub_id;
    String name;
    int capacityGB;

    

    public Storage(String sub_id, String name, int capacityGB) {
        this.sub_id = sub_id;
        this.name = name;
        this.capacityGB = capacityGB;
    }



    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }
    
    
}
