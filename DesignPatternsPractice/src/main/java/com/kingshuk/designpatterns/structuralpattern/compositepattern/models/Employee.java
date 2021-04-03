package com.kingshuk.designpatterns.structuralpattern.compositepattern.models;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@Data
@NoArgsConstructor
@Builder
public class Employee implements OrganizationComponent{
    private String name;

    private int age;

    @Override
    public void printName() {
        System.out.println("The employee name: "+this.name);
    }
}
