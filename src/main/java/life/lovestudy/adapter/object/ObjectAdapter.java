package life.lovestudy.adapter.object;

import life.lovestudy.adapter.Adaptee;
import life.lovestudy.adapter.Target;

public class ObjectAdapter implements Target {

    private Adaptee adaptee;

    public ObjectAdapter(Adaptee adaptee) {
        this.adaptee = adaptee;
    }

    @Override
    public void request() {
        System.out.println("request ....");
        this.adaptee.specificRequest();
    }

    public Adaptee getAdaptee() {
        return adaptee;
    }

    public void setAdaptee(Adaptee adaptee) {
        this.adaptee = adaptee;
    }
}
