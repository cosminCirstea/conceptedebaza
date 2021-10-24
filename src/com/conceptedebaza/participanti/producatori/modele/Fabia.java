package com.conceptedebaza.participanti.producatori.modele;

import com.conceptedebaza.participanti.producatori.Skoda;

public class Fabia extends Skoda {

    @Override
    public void afiseazaModel() {
        motor = alegeMotor(returneazalistaMotorizari());
        culoare = alegeCuloare();
        System.out.println("O Skoda Fabia de culoare " + culoare + " cu motor " + motor.getNumeMotor() +
                " de " + motor.getCilindree() + " cu o putere de " + motor.getCaiPutere() +
                " si " + "cuplu maxim de " + motor.getCuplu());
    }
}
