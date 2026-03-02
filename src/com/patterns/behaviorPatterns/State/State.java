package com.patterns.behaviorPatterns.State;

abstract public class State {

    protected Movil movil;

    public void setContext(Movil movil) {
        this.movil = movil;
    }

    public abstract String lock();
    public abstract String unlock();
    public abstract String openCamera();
    public abstract String takePhoto();
}
