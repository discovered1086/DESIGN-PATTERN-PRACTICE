package com.kingshuk.designpatterns.soliddesignprinciples.openclosedprinciple;

enum Color
{
    RED, GREEN, BLUE
}

enum Size
{
    SMALL, MEDIUM, LARGE, YUGE
}

public class Product {
	public String name;
    public Color color;
    public Size size;

    public Product(String name, Color color, Size size) {
        this.name = name;
        this.color = color;
        this.size = size;
    }
}
