package life.lovestudy.adapter.object;

import life.lovestudy.adapter.Adaptee;
import life.lovestudy.adapter.Target;

public class Main {

    public static void main(String[] args) {
        Adaptee adaptee = new Adaptee();
        Target target = new ObjectAdapter(adaptee);
        target.request();
    }
}
