package com.conceptedebaza.utilitati;

import com.conceptedebaza.participanti.Masina;

import java.util.List;
import java.util.Random;

public class Functii {

    public Integer genereazaNumarAleatoriuInInterval(int min, int max) {
        Random random = new Random();
        return random.nextInt(max - min) + min;
    }

    public void itereazaListaSiAfiseazaModel(List<Masina> lista) {
        for (Masina masina : lista) {
            masina.afiseazaModel();
        }
    }
}
