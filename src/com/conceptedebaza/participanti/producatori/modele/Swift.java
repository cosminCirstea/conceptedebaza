package com.conceptedebaza.participanti.producatori.modele;

import com.conceptedebaza.participanti.producatori.Suzuki;

public class Swift extends Suzuki {

    @Override
    public void afiseazaModel() {
        motor = alegeMotor(returneazalistaMotorizari());
        culoare = alegeCuloare();
        System.out.println("Un Suzuki Swift de culoare " + culoare + " cu motor " + motor.getNumeMotor() +
                " de " + motor.getCilindree() + " cu o putere de " + motor.getCaiPutere() +
                " si " + "cuplu maxim de " + motor.getCuplu());
    }

}
