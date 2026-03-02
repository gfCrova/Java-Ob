package com.patterns.behaviorPatterns.State;

public class LockState extends State {

    private static final LockState instance = new LockState();

    private LockState() {}

    public static LockState getInstance() {
        return instance;
    }

    @Override
    public String lock() {
        return "El móvil ya está bloqueado";
    }

    @Override
    public String unlock() {
        movil.setState(UnlockedState.getInstance());
        return "El móvil se ha desbloqueado";
    }

    @Override
    public String openCamera() {
        return "No se puede abrir la cámara, por favor desbloquee el móvil";
    }

    @Override
    public String takePhoto() {
        return "No es posible abrir la cámara para tomar una foto, por favor desbloquee el móvil";
    }
}
