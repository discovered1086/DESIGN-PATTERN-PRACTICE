package com.kingshuk.designpatterns.creationalpatterns.singletonpattern;

/**
 * Created by kingshuk on 11/6/17.
 */
public class SingletonClassPatternImpl {

    private String myName;

    private static SingletonClassPatternImpl singletonClassPattern = null;

    private SingletonClassPatternImpl(String name) {
        this.myName = name;
    }


    public static synchronized SingletonClassPatternImpl getSingletonPatternInstance(String myName) {

        if (singletonClassPattern == null) {
            singletonClassPattern = new SingletonClassPatternImpl(myName);
        }

        return singletonClassPattern;
    }

    public String getMyName() {
        return myName;
    }
}
