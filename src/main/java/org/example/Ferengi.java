package org.example;

public class Ferengi  extends HumanClient{

    public Ferengi() {
        super(new ImpatientStrategy());
    }
}
