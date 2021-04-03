package com.kingshuk.designpatterns.structuralpattern.compositepattern.models;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
public class Department implements OrganizationComponent{
    private String departmentName;

    private String location;

    private List<OrganizationComponent> subComponents;

    @Override
    public void printName() {
        System.out.println(this.toString());
    }
}
