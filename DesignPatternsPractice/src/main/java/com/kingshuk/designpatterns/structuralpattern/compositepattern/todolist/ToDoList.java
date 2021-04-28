package com.kingshuk.designpatterns.structuralpattern.compositepattern.todolist;

import lombok.AllArgsConstructor;
import lombok.Getter;

import java.util.List;

@AllArgsConstructor
@Getter
public class ToDoList implements ToDoListComponent{
    private final String title;
    private final List<ToDoListComponent> toDoListComponents;

    @Override
    public boolean isCompleted() {
        return toDoListComponents.stream()
                .allMatch(ToDoListComponent::isCompleted);
    }

    @Override
    public String getHtml() {
        StringBuilder html = new StringBuilder();
        html.append("<h2>").append(this.title)
                .append("</h2>").append("<ul>");

        toDoListComponents.forEach(toDoListComponent -> html.append("<li>")
                .append(toDoListComponent.getHtml())
                .append(":").append(toDoListComponent.isCompleted()?"Done":"Not Done")
                .append("</li>"));

        html.append("</ul>");

        return html.toString();
    }
}
