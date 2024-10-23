package com.company;

import java.util.ArrayList;
import java.util.List;

class Clasa {
    private int capacitate;
    private NumarClasa numar;
    private char litera;
    public List<Elev> elevi;

    public Clasa(int capacitate, NumarClasa numar, char litera) {
        this.capacitate = capacitate;
        this.numar = numar;
        this.litera = litera;
        this.elevi = new ArrayList<>();
    }

    public void adaugaElev(Elev elev) {
        if (elevi.size() < capacitate) {
            elevi.add(elev);
        } else {
            System.out.println("Clasa este plină!");
        }
    }

    public void eliminaElev(Elev elev) {
        elevi.remove(elev);
    }

    public int getTotalElevi() {
        return elevi.size();
    }

    @Override
    public String toString() {
        return "Clasa{" +
                "numar=" + numar +
                ", litera=" + litera +
                ", capacitate=" + capacitate +
                ", elevi=" + elevi +
                '}';
    }
}
