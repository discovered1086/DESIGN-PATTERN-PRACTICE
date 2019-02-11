package mycoding.structuralpatterns.decoratorpattern.headfirstexample;

public abstract class Beverage {
    String description;

    String size;

    public String getDescription() {
        return description;
    }

    public abstract Double cost();

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }
}
