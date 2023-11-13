package org.example;

import static java.lang.Character.*;

public class StringCaseChanger implements StringTransformer{
    @Override
    public void execute(StringDrink drink) {
        String n = new String();
        String k = drink.getText();
        for (int i = 0;i < k.length();i++){
            if (isLowerCase(k.charAt(i))) n += toUpperCase(k.charAt(i));
            else n += toLowerCase((k.charAt(i)));
        }
        drink.setText(n);
    }
    public void undo(StringDrink drink) {
            execute(drink);
    }
}
