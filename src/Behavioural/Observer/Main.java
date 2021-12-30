package Behavioural.Observer;
/*
Order Tracking systems - whenever there is change in the location or the order status, we will be notified(Aliexpress, Ebay)
Youtube subscribing - getting notification when uploading a video
*/

public class Main {
    public static void main(String[] args) {
        Channel nipunwaas = new Channel();

        Subscriber s1 = new Subscriber("chathuranga");
        Subscriber s2 = new Subscriber("sahira");
        Subscriber s3 = new Subscriber("kavinda");
        Subscriber s4 = new Subscriber("nimesha");
        Subscriber s5 = new Subscriber("mawnaka");

        nipunwaas.subscribe(s1);
        nipunwaas.subscribe(s2);
        nipunwaas.subscribe(s3);
        nipunwaas.subscribe(s4);
        nipunwaas.subscribe(s5);

        nipunwaas.unsubscribe(s3);

        s1.subscribeChannel(nipunwaas);
        s2.subscribeChannel(nipunwaas);
        s3.subscribeChannel(nipunwaas);
        s4.subscribeChannel(nipunwaas);
        s5.subscribeChannel(nipunwaas);

        //Uploading a new video
        nipunwaas.upload("Get started with haskell");
    }
}
