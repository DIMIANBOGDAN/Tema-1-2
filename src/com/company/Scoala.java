package com.company;

import java.util.HashMap;
import java.util.Map;

class Scoala {
    private Map<String, Clasa> clase;

    public Scoala() {
        this.clase = new HashMap<>();
    }

    public void adaugaClasa(String id, Clasa clasa) {
        clase.put(id, clasa);
    }

    public void eliminaClasa(String id) {
        clase.remove(id);
    }

    public void adaugaElevInClasa(String idClasa, Elev elev) {
        Clasa clasa = clase.get(idClasa);
        if (clasa != null) {
            clasa.adaugaElev(elev);
        } else {
            System.out.println("Clasa nu există!");
        }
    }

    public void eliminaElevDupaNume(String numeElev) {
        for (Clasa clasa : clase.values()) {
            clasa.elevi.removeIf(elev -> elev.getNume().equals(numeElev));
        }
    }

    public int getNumarClase() {
        return clase.size();
    }

    public int getTotalElevi() {
        int total = 0;
        for (Clasa clasa : clase.values()) {
            total += clasa.getTotalElevi();
        }
        return total;
    }

    @Override
    public String toString() {
        return "Scoala{" +
                "numar clase=" + getNumarClase() +
                ", total elevi=" + getTotalElevi() +
                '}';
    }
}