package org.example;

public class HumanClient implements Client{
    private OrderingStrategy str;
    public HumanClient(OrderingStrategy a ){str = a;}
    @Override
    public void happyHourStarted(Bar bar) {
        str.happyHourStarted((StringBar)bar);
    }

    @Override
    public void happyHourEnded(Bar bar) {
        str.happyHourEnded((StringBar)bar);
    }

    @Override
    public void wants(StringDrink drink, StringRecipe recipe, StringBar bar) {
        str.wants(drink,recipe,bar);
    }
}
