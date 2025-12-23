package BehaviouralDesignPatterns.ChainOfResponsiblity;

public class Director extends Manager{
    String name;

    Director(Manager manager, String name){
        this.manager = manager;
        this.name = name;
    }

    @Override
    void grantApproval(int salary) {
        if(salary < 100000){
            System.out.println("Salary Processed by Director : "+name);
        }
        else if(manager == null){
            System.out.println("Salary can't be processed!");
        }
        else{
            this.manager.grantApproval(salary);
        }
    }
    
    
}
