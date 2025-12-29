package BehaviouralDesignPatterns.StateDesignPattern2;

public class YellowLightIndicator implements TrafficLight {

    TrafficLightIndicator indicator;

    YellowLightIndicator(TrafficLightIndicator indicator){
        this.indicator = indicator;
    }

    @Override
    public void redLightSignal() {
        System.out.println("Yellow light is signalled");
    }

    @Override
    public void yellowLightSignal() {
        System.out.println("WAIT");
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        if(this.indicator.prevSignal=="RED"){
            this.indicator.signal = "GREEN";
        }
        else{
            this.indicator.signal = "RED";
        }
        this.indicator.prevSignal = "YELLOW";
    }

    @Override
    public void greenLightSignal() {
        System.out.println("Yellow light is signalled");
    }
}
