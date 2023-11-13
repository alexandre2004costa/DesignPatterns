package org.example;

public class StringInverter implements StringTransformer{
    public void execute(StringDrink w){
        String n = new String();
        String k = w.getText();
        for (int i = k.length() - 1;i >= 0;i--){
            n += k.charAt(i);
        }
        w.setText(n);
    }
    public void undo(StringDrink w){
        execute(w);
    }
}
