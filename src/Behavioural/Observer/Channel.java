package Behavioural.Observer;

import java.util.ArrayList;
import java.util.List;

public class Channel implements Subject {
    private List<Subscriber> subs = new ArrayList<>();
    private String title;

    @Override
    public void subscribe(Subscriber sub){
        subs.add(sub);
    }

    @Override
    public void unsubscribe(Subscriber sub){
        subs.remove(sub);
    }

    @Override
    public void notifySubscribers(){
        for(Subscriber sub: subs){
            sub.update(this.title);
        }
    }

    @Override
    public void upload(String title){
        this.title = title;
        notifySubscribers();
    }
}
