package com.wptdxii.playground.rxjava;

import io.reactivex.Observable;
import io.reactivex.ObservableSource;
import io.reactivex.functions.Consumer;
import io.reactivex.functions.Function;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;
import java.util.logging.Logger;

public class App {

    static final Logger logger = Logger.getGlobal();

    public static void main(String[] args) {
        testRxJava();
        sleep();
    }

    private static void sleep() {
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    private static void testRxJava() {
        Observable.just(1, 2, 3)
                .concatMap(new Function<Integer, ObservableSource<String>>() {
                    @Override
                    public ObservableSource<String> apply(Integer integer) throws Exception {
                        List<String> strings = new ArrayList<>();
                        for (int i = 0; i < 3; i++) {
                            strings.add("String:" + integer);
                        }
                        return Observable.fromIterable(strings).delay(10, TimeUnit.MILLISECONDS);
                    }
                }).subscribe(new Consumer<String>() {
            @Override
            public void accept(String s) throws Exception {
                logger.info(s);
            }
        });
    }
}
