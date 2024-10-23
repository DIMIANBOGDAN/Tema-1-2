package com.company;
import java.util.ArrayList;

// Enum pentru numărul clasei
enum NumarClasa {
    I, II, III, IV;
}

// Enum pentru genul elevilor
enum Gen {
    Masculin, Feminin, Nespecificat;
}

public class Main {
    public static void main(String[] args) {
        Scoala scoala = new Scoala();

        // Adăugăm câteva clase în școală
        Clasa clasa1A = new Clasa(30, NumarClasa.I, 'A');
        Clasa clasa2B = new Clasa(25, NumarClasa.II, 'B');

        scoala.adaugaClasa("1A", clasa1A);
        scoala.adaugaClasa("2B", clasa2B);

        // Adăugăm câțiva elevi în clase
        scoala.adaugaElevInClasa("1A", new Elev("Andrei", Gen.Masculin));
        scoala.adaugaElevInClasa("1A", new Elev("Maria", Gen.Feminin));
        scoala.adaugaElevInClasa("2B", new Elev("Ioana", Gen.Feminin));
        scoala.adaugaElevInClasa("2B", new Elev("Mihai", Gen.Masculin));

        // Afișăm informațiile despre școală
        System.out.println(scoala);

        // Eliminăm un elev după nume
        scoala.eliminaElevDupaNume("Ioana");

        // Afișăm din nou informațiile după eliminarea elevului
        System.out.println(scoala);

        // Eliminăm o clasă
        scoala.eliminaClasa("1A");

        // Afișăm informațiile după eliminarea clasei
        System.out.println(scoala);
    }
}
