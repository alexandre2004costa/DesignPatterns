package org.example;

public class StringReplacer implements StringTransformer{
    char ii ;
    char ff ;
    public StringReplacer(char p , char t){
        ii = p;
        ff = t;
    }
    @Override
    public void execute(StringDrink drink) {
        String n = new String();
        String k = drink.getText();
        for (int i = 0 ;i < k.length() ;i++){
            if (k.charAt(i) == ii)n += ff;
            else n += k.charAt(i);
        }
        drink.setText(n);
    }
    public void undo(StringDrink drink) {
        String n = new String();
        String k = drink.getText();
        for (int i = 0 ;i < k.length() ;i++){
            if (k.charAt(i) == ff)n += ii;
            else n += k.charAt(i);
        }
        drink.setText(n);
    }
}
