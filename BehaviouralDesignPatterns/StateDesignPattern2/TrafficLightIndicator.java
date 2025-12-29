package BehaviouralDesignPatterns.StateDesignPattern2;

public class TrafficLightIndicator {

    String signal;
    String prevSignal;
    TrafficLight state;
    TrafficLightIndicator(){
        this.signal = "RED";
        state = new RedLightIndicator(this);
        this.prevSignal = "YELLOW";
    }



    public static void main(String[] args) {

        TrafficLightIndicator trafficLightIndicator = new TrafficLightIndicator();
        TrafficLight red = new RedLightIndicator(trafficLightIndicator);
        TrafficLight yellow = new YellowLightIndicator(trafficLightIndicator);
        TrafficLight green = new GreenLightIndicator(trafficLightIndicator);

        red.greenLightSignal();
        red.redLightSignal();
        red.yellowLightSignal();
        System.out.println();
        
        yellow.greenLightSignal();
        yellow.redLightSignal();
        yellow.yellowLightSignal();
        System.out.println();

        green.greenLightSignal();
        green.redLightSignal();
        green.yellowLightSignal();
        
    }
    
}
