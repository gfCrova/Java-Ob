package com.patterns.behaviorPatterns.State;

public class UnlockedState extends State {

    private static final UnlockedState instance = new UnlockedState();

    private UnlockedState() {}

    public static UnlockedState getInstance() {
        return instance;
    }

    @Override
    public String lock() {
        movil.setState(LockState.getInstance());
        return "El móvil se ha bloqueado";
    }

    @Override
    public String unlock() {
        return "El móvil ya se encuentra desbloqueado";
    }

    @Override
    public String openCamera() {
        movil.setState(OpenCameraState.getInstance());
        return "Abriendo cámara";
    }

    @Override
    public String takePhoto() {
        return "No es posible tomar una foto, por favor abra la cámara";
    }
}
