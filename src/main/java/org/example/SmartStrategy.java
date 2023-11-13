package org.example;
import java.util.ArrayList;
import java.util.List;

public class SmartStrategy implements OrderingStrategy{
    private List<StringDrink> bebidas = new ArrayList<>();
    private List<StringRecipe> receitas = new ArrayList<>();
    @Override
    public void wants(StringDrink drink, StringRecipe recipe, StringBar bar) {
        if (bar.isHappyHour()){
            bar.order(drink,recipe);
        }else{
            bebidas.add(drink);
            receitas.add(recipe);
        }
    }

    @Override
    public void happyHourStarted(StringBar bar) {
        for (int i = 0 ; i < bebidas.size() ; i++){
            bar.order(bebidas.get(i),receitas.get(i));
        }
    }

    @Override
    public void happyHourEnded(StringBar bar) {

    }
}
