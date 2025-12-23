package BehaviouralDesignPatterns.ChainOfResponsiblity;

abstract class Manager {
    Manager manager;
    abstract void grantApproval(int salary);
}
