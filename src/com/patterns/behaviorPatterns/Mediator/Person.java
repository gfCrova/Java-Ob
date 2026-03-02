package com.patterns.behaviorPatterns.Mediator;

abstract public class Person {

    protected Mediator mediator;

    // Se encarga de asignar el mediator a la persona.
    public void setMediator(Mediator mediator){
        this.mediator = mediator;
    }

    abstract public void sendMediator();
    abstract public void receiveMediator();
}
