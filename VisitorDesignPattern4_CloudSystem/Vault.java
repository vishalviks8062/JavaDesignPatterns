package VisitorDesignPattern4_CloudSystem;

public class Vault implements Resource {
    String name;
    String sub_id;
    boolean hasCert;
    boolean hasKey;
    public Vault(String name, String sub_id, boolean hasCert, boolean hasKey) {
        this.name = name;
        this.sub_id = sub_id;
        this.hasCert = hasCert;
        this.hasKey = hasKey;
    }
    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }
}
