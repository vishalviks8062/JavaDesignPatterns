package BehaviouralDesignPatterns.ChainOfResponsiblity;

public class SeniorManager extends Manager {

    String name;

    SeniorManager(Manager manager, String name){
        this.manager = manager;
        this.name = name;
    }

    @Override
    void grantApproval(int salary) {
        if(salary < 50000){
            System.out.println("Salary Processed by Senior Manager: "+name);
        }
        else{
            this.manager.grantApproval(salary);
        }
    }
    
}
