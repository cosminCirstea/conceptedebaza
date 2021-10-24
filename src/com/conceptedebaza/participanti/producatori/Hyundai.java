package com.conceptedebaza.participanti.producatori;

import com.conceptedebaza.componente.Motor;
import com.conceptedebaza.participanti.Masina;

import java.util.List;

public abstract class Hyundai extends Masina {

    @Override
    protected List<Motor> returneazalistaMotorizari() {
        Motor tgdi = new Motor("T-GDI", 1.0F, 100, 172);
        Motor mpi = new Motor("MPI", 1.2F, 84, 122);
        Motor nline = new Motor("nLine", 1.6F, 204, 275);
        return List.of(tgdi, mpi, nline);
    }

}
