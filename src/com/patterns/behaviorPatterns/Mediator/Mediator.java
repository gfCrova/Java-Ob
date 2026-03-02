package com.patterns.behaviorPatterns.Mediator;

abstract public class Mediator {
    abstract public void register(Person person);
    abstract public void forward(Person person);
}
