package Behavioural.Observer;

public class Subscriber implements Observer {
    private String name;
    private Channel channel;

    public Subscriber(String name) {
        this.name = name;
    }

    @Override
    public void update(String title){
        System.out.println("Hey "+name+"! "+title+" Video uploaded");
    }

    @Override
    public void subscribeChannel(Channel c){
        channel = c;
    }
}
