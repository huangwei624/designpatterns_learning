package life.lovestudy.adapter.clazz;

import life.lovestudy.adapter.Adaptee;
import life.lovestudy.adapter.Target;

public class ClassAdapter extends Adaptee implements Target {

    @Override
    public void request() {
        System.out.println("request ...");
        this.specificRequest();
    }
}
