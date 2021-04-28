package com.kingshuk.designpatterns.structuralpattern.compositepattern.todolist;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public class SingleToDoComponent implements ToDoListComponent{

    private String text;
    private boolean done;
    @Override
    public boolean isCompleted() {
        return done;
    }

    @Override
    public String getHtml() {
        return text;
    }
}
