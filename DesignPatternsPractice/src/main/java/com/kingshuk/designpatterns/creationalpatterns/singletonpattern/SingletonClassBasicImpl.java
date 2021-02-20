package com.kingshuk.designpatterns.creationalpatterns.singletonpattern;

/**
 * Created by kingshuk on 11/6/17.
 */
public class SingletonClassBasicImpl {

    private String myName;

    public SingletonClassBasicImpl(String myName) {
        this.myName = myName;
    }

    public String getMyName() {
        return myName;
    }

    public void setMyName(String myName) {
        this.myName = myName;
    }
}
