package com.kingshuk.designpatterns.structuralpattern.compositepattern.todolist;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Arrays;

public class ToDoListDemo {

    private static final Logger logger = LoggerFactory.getLogger(ToDoListDemo.class);

    public static void main(String[] args) {
        ToDoListComponent travelToUs = new ToDoList("US Travel",
                Arrays.asList(new SingleToDoComponent("Book tickets", true),
                        new ToDoList("Passport Stamping",
                                Arrays.asList(new SingleToDoComponent("Travel to Kolkata", true),
                                        new SingleToDoComponent("Take all documents", true),
                                        new SingleToDoComponent("Stamp passport", false))),
                        new SingleToDoComponent("Go to the airport", false)));

        logger.info(travelToUs.getHtml());
    }
}
