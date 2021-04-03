package com.kingshuk.designpatterns.structuralpattern.compositepattern;

import com.kingshuk.designpatterns.structuralpattern.compositepattern.models.Department;
import com.kingshuk.designpatterns.structuralpattern.compositepattern.models.Employee;
import com.kingshuk.designpatterns.structuralpattern.compositepattern.models.OrganizationComponent;

import java.util.Arrays;

public class CompositePatternDemo {

    public static void main(String[] args) {
        final OrganizationComponent kingshuk = Employee.builder()
                .name("Kingshuk Mukherjee").age(34).build();
        final OrganizationComponent amit = Employee.builder()
                .name("Amit Biswas").age(33).build();

        final Employee deeksha = Employee.builder()
                .name("Deeksha Banerjee").age(31).build();

        OrganizationComponent department1 = Department.builder()
                .departmentName("Finance")
                .location("San Francisco, CA")
                .subComponents(Arrays.asList(kingshuk, amit))
                .build();

        OrganizationComponent department2 = Department.builder()
                .departmentName("IT")
                .location("San Jose, CA")
                .subComponents(Arrays.asList(kingshuk, deeksha))
                .build();

        OrganizationComponent operations = Department.builder()
                .departmentName("Operations")
                .location("San Diego, CA")
                .subComponents(Arrays.asList(department1, department2))
                .build();

        department1.printName();
        department2.printName();
        operations.printName();
    }
}
