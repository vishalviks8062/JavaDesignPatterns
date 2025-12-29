package BehaviouralDesignPatterns.StateDesignPattern2;

public class GreenLightIndicator implements TrafficLight {
    TrafficLightIndicator indicator;

    GreenLightIndicator(TrafficLightIndicator indicator){
        this.indicator = indicator;
    }

    @Override
    public void redLightSignal() {
        System.out.println("GREEN light is signalled");
    }

    @Override
    public void yellowLightSignal() {
        System.out.println("GREEN light is signalled");
    }

    @Override
    public void greenLightSignal() {
        System.out.println("RUN");
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        this.indicator.signal = "YELLOW";
        this.indicator.prevSignal = "GREEN";
    }
    
}