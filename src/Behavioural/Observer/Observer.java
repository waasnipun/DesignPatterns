package Behavioural.Observer;

public interface Observer {
    void update(String title);

    void subscribeChannel(Channel c);
}
