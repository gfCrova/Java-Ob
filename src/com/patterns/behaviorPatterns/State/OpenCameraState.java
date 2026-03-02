package com.patterns.behaviorPatterns.State;

public class OpenCameraState extends State {

    private static final OpenCameraState instance = new OpenCameraState();

    private OpenCameraState() {}

    public static OpenCameraState getInstance() {
        return instance;
    }

    @Override
    public String lock() {
        movil.setState(LockState.getInstance());
        return "El móvil se ha bloqueado";
    }

    @Override
    public String unlock() {return "El móvil ya se encuentra desbloqueado";}

    @Override
    public String openCamera() {
        return "La cámara ya se encuentra abierta";
    }

    @Override
    public String takePhoto() {
        movil.setState(PhotoState.getInstance());
        return "Tomando foto... Listo! la foto fue guardada en la galería";
    }
}
