package BehaviouralDesignPatterns.ChainOfResponsiblity;

public class Candidate {
    String name;
    int demand;

    Candidate(String name, int expectations){
        this.name = name;
        this.demand = expectations;
    }
}
