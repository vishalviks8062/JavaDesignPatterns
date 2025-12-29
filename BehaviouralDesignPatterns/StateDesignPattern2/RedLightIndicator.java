package BehaviouralDesignPatterns.StateDesignPattern2;

public class RedLightIndicator implements TrafficLight {

    TrafficLightIndicator indicator;

    RedLightIndicator(TrafficLightIndicator indicator){
        this.indicator = indicator;
    }



    @Override
    public void redLightSignal() {
        System.out.println("STOP");
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        this.indicator.signal = "YELLOW";
        this.indicator.prevSignal = "RED";
        
    }

    @Override
    public void yellowLightSignal() {
        System.out.println("RED Light signalled! Please stop");
    }

    @Override
    public void greenLightSignal() {
        System.out.println("RED Light signalled! Please stop");
    }
    
}
