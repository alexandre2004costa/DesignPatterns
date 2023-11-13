package org.example;

public class Romulan extends HumanClient{
    public Romulan() {
        super(new ImpatientStrategy());
    }
}
