package com.conceptedebaza.utilitati;

import com.conceptedebaza.Afisabil;
import com.conceptedebaza.participanti.Masina;
import com.conceptedebaza.participanti.producatori.modele.*;

import java.util.List;

public class Concurs implements Afisabil {

    @Override
    public void afiseazaMasinileParticipante() {
        System.out.println("Masinile inscrise in cursa sunt urmatoarele:");
        System.out.println();
        new Functii().itereazaListaSiAfiseazaModel(returneazaMasiniInscrise());
    }

    private List<Masina> returneazaMasiniInscrise() {
        Masina hyundai = new I20();
        Masina renault = new Clio();
        Masina skoda = new Fabia();
        Masina suzuki = new Swift();
        Masina toyota = new Yaris();
        return List.of(hyundai, renault, skoda, suzuki, toyota);
    }


}
