package com.conceptedebaza.participanti;

import com.conceptedebaza.componente.Motor;
import com.conceptedebaza.utilitati.Functii;

import java.util.List;

public abstract class Masina {

    protected String culoare = "Alba";
    protected Motor motor;

    public float getTimpScos() {
        return timpScos;
    }

    public void setTimpScos(float timpScos) {
        this.timpScos = timpScos;
    }

    protected float timpScos;

    public abstract void afiseazaModel();
    protected abstract List<Motor> returneazalistaMotorizari();

    protected String alegeCuloare() {
        List<String> listaCulori = List.of("Alba", "Rosie", "Albastra", "Verde", "Neagra", "Galbena", "Argintie");
        int numarAleatoriu = new Functii().genereazaNumarAleatoriuInInterval(0, listaCulori.size());
        return listaCulori.get(numarAleatoriu);
    }

    protected Motor alegeMotor(List<Motor> listaMotorizari) {
        int numarAleatoriu = new Functii().genereazaNumarAleatoriuInInterval(0, listaMotorizari.size());
        return listaMotorizari.get(numarAleatoriu);
    }

}
