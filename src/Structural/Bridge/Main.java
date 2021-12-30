package Structural.Bridge;

abstract class TV{
    abstract void on();
    abstract void off();
}

class Sony extends TV{
    Remote remoteType;
    Sony(Remote r){
        this.remoteType = r;
    }

    @Override
    void on() {
        System.out.println("Sony TV is on: ");
        remoteType.on();
    }

    @Override
    void off() {
        System.out.println("Sony TV is off: ");
        remoteType.off();
    }
}

class Philips extends TV{
    Remote remoteType;
    Philips(Remote r){
        this.remoteType = r;
    }

    @Override
    void on() {
        System.out.println("Philips TV is on: ");
        remoteType.on();
    }

    @Override
    void off() {
        System.out.println("Philips TV is off: ");
        remoteType.off();
    }
}

interface Remote{
    public void on();
    public void off();
}

class OldRemote implements Remote{

    @Override
    public void on() {
        System.out.println("On with old remote");
    }

    @Override
    public void off() {
        System.out.println("Off with old remote");
    }
}

class NewRemote implements Remote{

    @Override
    public void on() {
        System.out.println("On with new remote");
    }

    @Override
    public void off() {
        System.out.println("Off with new remote");
    }
}

public class Main {
    public static void main(String[] args) {
        TV sonyOldRemote = new Sony(new OldRemote());
        sonyOldRemote.on();
        sonyOldRemote.off();
        System.out.println();
    }
}
