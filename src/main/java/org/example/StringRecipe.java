package org.example;

import java.util.List;

public class StringRecipe {
    List<StringTransformer> t;
    public StringRecipe(List<StringTransformer> p){t = p;}
    public void mix(StringDrink d){
        for (StringTransformer k : t){
            k.execute(d);
        }
    }


}
