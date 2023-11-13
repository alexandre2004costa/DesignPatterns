package org.example;

import java.util.List;

public class StringTransformerGroup implements StringTransformer{
    List<StringTransformer> t;
    public StringTransformerGroup(List<StringTransformer> p){t = p;}

    @Override
    public void execute(StringDrink drink) {
        for (StringTransformer k : t){
            k.execute(drink);
        }
    }
}
