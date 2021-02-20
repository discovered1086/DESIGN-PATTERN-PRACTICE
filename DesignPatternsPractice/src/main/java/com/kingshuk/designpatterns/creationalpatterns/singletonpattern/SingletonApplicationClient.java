package com.kingshuk.designpatterns.creationalpatterns.singletonpattern;

/**
 * Created by kingshuk on 11/6/17.
 */
public class SingletonApplicationClient {

    public static void main(String[] args) {

        /*SingletonClassBasicImpl singletonClass=new SingletonClassBasicImpl("Kingshuk");

        System.out.println("My name is "+ singletonClass.getMyName());

        SingletonClassBasicImpl secondSingletonClass=new SingletonClassBasicImpl("Deeksha");

        System.out.println("My name is "+ secondSingletonClass.getMyName());*/


        //Below is the implementation of the singleton pattern
        SingletonClassPatternImpl patternImpl=SingletonClassPatternImpl.getSingletonPatternInstance("Kingshuk");

        System.out.println("My name is "+ patternImpl.getMyName());

        SingletonClassPatternImpl patternImpl2=SingletonClassPatternImpl.getSingletonPatternInstance("Deeksha");

        System.out.println("My name is "+ patternImpl2.getMyName());

        System.out.println("Same object?? "+(patternImpl==patternImpl2));
    }
}
