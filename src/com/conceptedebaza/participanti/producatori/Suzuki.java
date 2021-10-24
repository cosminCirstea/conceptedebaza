package com.conceptedebaza.participanti.producatori;

import com.conceptedebaza.componente.Motor;
import com.conceptedebaza.participanti.Masina;

import java.util.List;

public abstract class Suzuki extends Masina {

    protected List<Motor> returneazalistaMotorizari() {
        Motor dualJet = new Motor("DualJet", 1.2F, 83, 107);
        Motor boosterJet = new Motor("BoosterJet", 1.0F, 102, 150);
        Motor sport = new Motor("sport", 1.4F, 140, 230);

        return List.of(dualJet, boosterJet, sport);
    }

}
