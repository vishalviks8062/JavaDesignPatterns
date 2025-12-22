package BehaviouralDesignPatterns.ObservableDesignPattern;
import java.util.*;

public class VideoChannel implements Channel {
    List<Observer> subscribers;
    String channelName;
    String newVideo = "";

    VideoChannel(String name){
        subscribers = new ArrayList<>();
        channelName = name;
    }

    @Override
    public boolean addSubscriber(Observer observer) {
        try{
            subscribers.add(observer);
        }
        catch(Exception e){
            throw new UnsupportedOperationException("Unimplemented method 'addSubscriber'");
        }
        finally{}

        return true;
    }

    @Override
    public boolean removeSubsriber(Observer observer) {
        try{
            subscribers.remove(observer);
        }
        catch(Exception e){
            throw new UnsupportedOperationException("Unimplemented method 'removeSubsriber'");
        }
        finally{
        }
        return true;
    }

    @Override
    public void notifyAllSubsribers() {
        for(Observer subscriber: subscribers){
            if(newVideo != "") subscriber.notifyObserver(newVideo, channelName);
        }
    }

    public void newVideoAdded(String Title){
        this.newVideo = Title;
        notifyAllSubsribers();
    }
    
}
