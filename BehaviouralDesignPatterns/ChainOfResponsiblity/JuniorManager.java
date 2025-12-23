package BehaviouralDesignPatterns.ChainOfResponsiblity;

public class JuniorManager extends Manager {
    String name;

    JuniorManager(Manager manager, String name){
        this.manager = manager;
        this.name = name;
    }

    @Override
    void grantApproval(int salary) {
        if(salary < 20000){
            System.out.println("Salary Processed by Junior Manager: "+name);
        }
        else{
            this.manager.grantApproval(salary);
        }
    }
    
}
