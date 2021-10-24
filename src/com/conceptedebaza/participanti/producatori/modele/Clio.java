package com.conceptedebaza.participanti.producatori.modele;

import com.conceptedebaza.participanti.producatori.Renault;

public class Clio extends Renault {

    @Override
    public void afiseazaModel() {
        motor = alegeMotor(returneazalistaMotorizari());
        culoare = alegeCuloare();
        System.out.println("Un Renault Clio de culoare " + culoare + " cu motor " + motor.getNumeMotor() +
                " de " + motor.getCilindree() + " cu o putere de " + motor.getCaiPutere() +
                " si " + "cuplu maxim de " + motor.getCuplu());
    }
}
