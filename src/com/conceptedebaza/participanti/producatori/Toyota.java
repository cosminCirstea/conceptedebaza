package com.conceptedebaza.participanti.producatori;

import com.conceptedebaza.componente.Motor;
import com.conceptedebaza.participanti.Masina;

import java.util.List;

public abstract class Toyota extends Masina {

    protected List<Motor> returneazalistaMotorizari() {
        Motor oneLitre = new Motor("oneLitre", 1.0F, 69, 92);
        Motor oneHalf = new Motor("oneHalf", 1.5F, 120, 140);
        Motor grSport = new Motor("grSport", 1.6F, 261, 360);

        return List.of(oneLitre, oneHalf, grSport);
    }

}
