package BehaviouralDesignPatterns.ChainOfResponsiblity;

public class Client {
    public static void main(String[] args) {
        Director director = new Director(null, "Satish");
        SeniorManager seniorManager = new SeniorManager(director, "Prakash");
        JuniorManager juniorManager = new JuniorManager(seniorManager, "Kumar");

        Candidate ravi = new Candidate("Ravi", 10000);
        juniorManager.grantApproval(ravi.demand);

        Candidate mohan = new Candidate("Mohan", 60000);
        juniorManager.grantApproval(mohan.demand);

        Candidate sakshi = new Candidate("Ravi", 150000);
        juniorManager.grantApproval(sakshi.demand);

        Candidate prena = new Candidate("Prena", 40000);
        juniorManager.grantApproval(prena.demand);

    }
}
