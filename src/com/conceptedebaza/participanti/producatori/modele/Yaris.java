package com.conceptedebaza.participanti.producatori.modele;

import com.conceptedebaza.participanti.producatori.Toyota;

public class Yaris extends Toyota {

    @Override
    public void afiseazaModel() {
        motor = alegeMotor(returneazalistaMotorizari());
        culoare = alegeCuloare();
        System.out.println("O Toyota Yaris de culoare " + culoare + " cu motor " + motor.getNumeMotor() +
                " de " + motor.getCilindree() + " cu o putere de " + motor.getCaiPutere() +
                " si " + "cuplu maxim de " + motor.getCuplu());
    }

}
