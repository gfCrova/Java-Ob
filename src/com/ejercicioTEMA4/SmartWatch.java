package com.ejercicioTEMA4;

public class SmartWatch extends SmartDevice{

    private String materialMalla;
    private String tipoMalla;
    private boolean resistenciaAlAgua;


    public SmartWatch() {
    }

    public SmartWatch(String fabricante, String modelo, int anioLanzamiento, String color, String SO, double sizePantalla, String conectividad, String materialMalla, String tipoMalla, boolean resistenciaAlAgua) {
        super(fabricante, modelo, anioLanzamiento, color, SO, sizePantalla, conectividad);
        this.setMaterialMalla(materialMalla);
        this.setTipoMalla(tipoMalla);
        this.setResistenciaAlAgua(resistenciaAlAgua);
    }


    public String getMaterialMalla() {
        return materialMalla;
    }

    public void setMaterialMalla(String materialMalla) {
        this.materialMalla = materialMalla;
    }

    public String getTipoMalla() {
        return tipoMalla;
    }

    public void setTipoMalla(String tipoMalla) {
        this.tipoMalla = tipoMalla;
    }

    public boolean isResistenciaAlAgua() {
        return resistenciaAlAgua;
    }

    public void setResistenciaAlAgua(boolean resistenciaAlAgua) {
        this.resistenciaAlAgua = resistenciaAlAgua;
    }

    @Override
    public String toString() {
        return  "SmartWatch: { " +
                super.toString() + '\n' +
                "Material de Malla = '" + getMaterialMalla() + '\'' +  '\n' +
                "Tipo de Malla = '" + getTipoMalla() + '\'' +  '\n' +
                "Resistencia al Agua = " + isResistenciaAlAgua() +  '\n' +
                '}';
    }
}
