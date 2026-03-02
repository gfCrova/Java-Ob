package com.patterns.behaviorPatterns.Mediator;

import java.util.ArrayList;

public class ConcreteMediator extends Mediator {

    ArrayList<Person> persons = new ArrayList<>();

    // Se agregan las personas al mediator.
    @Override
    public void register(Person person) {
        if(!persons.contains(person)){   // Se verifica que la persona no se repita
            persons.add(person);
            person.setMediator(this);    // Se le asigna el 'mediator' como su mediador en concreto.
        }
    }

    // Se recorre la lista de personas y se reenvía el mensaje a todas las personas excepto a la persona que envió el mensaje.
    @Override
    public void forward(Person person) {
        for (Person p : persons) {
            if (!p.equals(person)) {   // Se verifica que la persona no sea la que envió el mensaje
                p.receiveMediator();
            }
        }
    }
}
