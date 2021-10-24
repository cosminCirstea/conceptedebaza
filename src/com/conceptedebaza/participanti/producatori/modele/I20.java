package com.conceptedebaza.participanti.producatori.modele;

import com.conceptedebaza.participanti.producatori.Hyundai;

public class I20 extends Hyundai {

    @Override
    public void afiseazaModel() {
        motor = alegeMotor(returneazalistaMotorizari());
        culoare = alegeCuloare();
        System.out.println("Un Hyundai i20 de culoare " + culoare + " cu motor " + motor.getNumeMotor() +
                " de " + motor.getCilindree() + " cu o putere de " + motor.getCaiPutere() +
                " si " + "cuplu maxim de " + motor.getCuplu());
    }
}
