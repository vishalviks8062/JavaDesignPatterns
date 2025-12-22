package BehaviouralDesignPatterns.ObservableDesignPattern;

public class Client {
    public static void main(String[] args) {
        VideoChannel YTChannel = new VideoChannel("Byte Byte Go");
        VideoChannel InstaChannel = new VideoChannel("Learn to Be Fit");

        Observer vishal = new Subscriber("Vishal", "1");
        Observer viks = new Subscriber("Viks", "2");

        YTChannel.addSubscriber(viks);
        YTChannel.addSubscriber(vishal);
        InstaChannel.addSubscriber(viks);

        YTChannel.newVideoAdded("In Depth understanding for load balancers. ");
        InstaChannel.newVideoAdded("How to master Gym Back Excercises");

        InstaChannel.addSubscriber(vishal);
        YTChannel.removeSubsriber(vishal);

        System.out.println("<------------------------------------------------------------------->");

        YTChannel.newVideoAdded("In Depth understanding for Databases. ");
        InstaChannel.newVideoAdded("How to master Gym Leg Excercises");

    }
    
}
