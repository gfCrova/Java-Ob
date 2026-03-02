package com.patterns.behaviorPatterns.State;

public class Movil {
    public State state;

    public Movil() {
        setState(LockState.getInstance());
    }

    // Cambia el estado del móvil
    public void setState(State state) {
        this.state = state;
        this.state.setContext(this);
        System.out.println("Nuevo estado: " + this.state.getClass().getSimpleName());
    }

    public String unlock() {
        return state.unlock();
    }

    public String lock() {
        return state.lock();
    }

    public String openCamera() {
        return state.openCamera();
    }

    public String takePhoto() {
        return state.takePhoto();
    }
}
