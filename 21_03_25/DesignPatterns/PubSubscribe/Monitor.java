package PubSubscribe;

import java.util.concurrent.*;
import java.util.concurrent.Flow.Subscriber;
import java.util.concurrent.Flow.Subscription;

/** ConcreteObserver */
public class Monitor implements Subscriber{
    private int numOperazioni = 0;
    public void onSubscribe(Subscription s){

    }
    public void onError(Throwable e){

    }
    public void onComplete(){

    }
    @Override
    public void onNext(Object item) {
        throw new UnsupportedOperationException("Unimplemented method 'onNext'");
    }
}
