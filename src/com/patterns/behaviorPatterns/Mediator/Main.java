package com.patterns.behaviorPatterns.Mediator;

public class Main {
    public static void main(String[] args) {
        Mediator mediator = new ConcreteMediator();
        Person person1 = new ConcretePerson1();
        Person person2 = new ConcretePerson2();

        mediator.register(person1);
        mediator.register(person2);

        person1.sendMediator();
        person2.sendMediator();
    }
}
