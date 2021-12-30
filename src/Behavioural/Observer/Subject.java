package Behavioural.Observer;

public interface Subject {
    void subscribe(Subscriber sub);

    void unsubscribe(Subscriber sub);

    void notifySubscribers();

    void upload(String title);
}
