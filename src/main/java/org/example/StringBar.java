package org.example;

public class StringBar extends Bar{
    private boolean hh;
    public StringBar(){hh = false;}
    @Override
    public boolean isHappyHour() {
        return hh;
    }
    @Override
    public void startHappyHour() {
        hh = true;
        super.notifyObservers();
    }
    @Override
    public void endHappyHour() {
        hh = false;
        super.notifyObservers();
    }
    public void order(StringDrink drink, StringRecipe recipe){
        recipe.mix(drink);
    }
}
