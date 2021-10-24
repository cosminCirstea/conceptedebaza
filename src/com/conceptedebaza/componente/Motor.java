package com.conceptedebaza.componente;

public class Motor {

    private float cilindree;
    private int caiPutere;
    private int cuplu;
    private String numeMotor;

    public Motor(String numeMotor, float cilindree, int caiPutere, int cuplu) {
        this.numeMotor = numeMotor;
        this.cilindree = cilindree;
        this.caiPutere = caiPutere;
        this.cuplu = cuplu;
    }

    public String getNumeMotor() {
        return numeMotor;
    }

    public void setNumeMotor(String numeMotor) {
        this.numeMotor = numeMotor;
    }

    public float getCilindree() {
        return cilindree;
    }

    public void setCilindree(float cilindree) {
        this.cilindree = cilindree;
    }

    public int getCaiPutere() {
        return caiPutere;
    }

    public void setCaiPutere(int caiPutere) {
        this.caiPutere = caiPutere;
    }

    public int getCuplu() {
        return cuplu;
    }

    public void setCuplu(int cuplu) {
        this.cuplu = cuplu;
    }
}
