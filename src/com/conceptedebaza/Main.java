package com.conceptedebaza;

import com.conceptedebaza.utilitati.Concurs;

public class Main {

    public static void main(String[] args) {

        //x masini s-au inscris in cursa - itereaza lista si prezinta masinile
        Afisabil afiseaza = new Concurs();
        afiseaza.afiseazaMasinileParticipante();

        //incepe cursa fiecare masina scoate x timp in tura 1
        //incepe cursa pt tura 2 - fiecare masina scoate y timp in tura 2
        //castigatorii turei 1 - sortare simpla dupa timpul cel mai scurt
        //castigatorii turei 2 - la fel
        //castigatorii per total tura 1 si 2 - calcule intre tura 1 si 2 si redarea castigatorilor

        //bonus de distractie: ia input-ul userului punandu-l sa ghiceasca care din masini va castiga
    }
}
