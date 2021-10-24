package com.conceptedebaza.participanti.producatori;

import com.conceptedebaza.componente.Motor;
import com.conceptedebaza.participanti.Masina;

import java.util.List;

public abstract class Renault extends Masina {

    protected List<Motor> returneazalistaMotorizari() {
        Motor sce = new Motor("SCe", 1.0F, 75, 95);
        Motor tce = new Motor("TCe", 1.0F, 100, 160);
        Motor rs = new Motor("rs", 1.6F, 200, 240);

        return List.of(sce, tce, rs);
    }

}
