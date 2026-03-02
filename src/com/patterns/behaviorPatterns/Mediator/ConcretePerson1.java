package com.patterns.behaviorPatterns.Mediator;

public class ConcretePerson1 extends Person {

    @Override
    public void sendMediator(){
        System.out.println("Person 1: Send message!");
        mediator.forward(this);  // Se envía el mensaje al mediator.
    }

    @Override
    public void receiveMediator(){
        System.out.println("Receive message, I'm person 1");
    }

}
