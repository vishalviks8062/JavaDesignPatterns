package BehaviouralDesignPatterns.ObservableDesignPattern;

interface Channel {
    boolean addSubscriber(Observer observer);
    boolean removeSubsriber(Observer observer) throws Exception;
    void notifyAllSubsribers();
    
}
