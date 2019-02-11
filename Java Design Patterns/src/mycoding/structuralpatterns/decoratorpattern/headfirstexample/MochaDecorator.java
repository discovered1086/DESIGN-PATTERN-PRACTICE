package mycoding.structuralpatterns.decoratorpattern.headfirstexample;

public class MochaDecorator extends CondimentDecorator {

    Beverage beverage;

    public MochaDecorator(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription()+", Mocha";
    }

    @Override
    public Double cost() {
        return beverage.cost()+0.25;
    }
}
