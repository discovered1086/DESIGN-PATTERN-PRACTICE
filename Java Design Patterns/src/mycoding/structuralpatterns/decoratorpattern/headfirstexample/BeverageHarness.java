package mycoding.structuralpatterns.decoratorpattern.headfirstexample;

import java.text.DecimalFormat;

public class BeverageHarness {

    public static void main(String[] args) {
        //Ordering an espresso without any condiments
        Beverage espressoBeverage=new Espresso();
        System.out.println(espressoBeverage.getDescription()+"\n"+ espressoBeverage.cost());


        //Ordering a Dark Roast with double mocha and whip
        Beverage darkRoastDoubleMochaWhip=new DarkRoast();
        Beverage mocha1=new MochaDecorator(darkRoastDoubleMochaWhip);
        Beverage mocha2=new MochaDecorator(mocha1);
        Beverage whip=new WhipDecorator(mocha2);

        System.out.println("You have ordered "+whip.getDescription());
        System.out.println("and it'll cost "+new DecimalFormat("##.00").format(whip.cost()));

        //Ordering a house blend with mocha whip and soy
        Beverage houseBlendSoyMochaWhip=new HouseBlend();
        Beverage mocha=new MochaDecorator(houseBlendSoyMochaWhip);
        Beverage whip2=new WhipDecorator(mocha);
        Beverage soy=new SoyDecorator(whip2);

        System.out.println("You have ordered "+soy.getDescription());
        System.out.println("and it'll cost "+new DecimalFormat("##.00").format(soy.cost()));

    }
}
