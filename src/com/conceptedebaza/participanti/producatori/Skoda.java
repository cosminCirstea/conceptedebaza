package com.conceptedebaza.participanti.producatori;

import com.conceptedebaza.componente.Motor;
import com.conceptedebaza.participanti.Masina;

import java.util.List;

public abstract class Skoda extends Masina {

    protected List<Motor> returneazalistaMotorizari() {
        Motor mpi = new Motor("MPI", 1.0F, 80, 93);
        Motor tsi = new Motor("TSI", 1.0F, 110, 200);
        Motor vRS = new Motor("vRS", 1.5F, 150, 250);

        return List.of(mpi, tsi, vRS);
    }

}
