package com.patterns.behaviorPatterns.State;

public class PhotoState extends State {

    private static final PhotoState instance = new PhotoState();

    private PhotoState() {}

    public static PhotoState getInstance() {
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
        return "La cámara ya se encuentra abierta";
    }

    @Override
    public String takePhoto() {
        return "Tomando foto... Listo! Su foto se ha guardado en la galería";
    }
}
