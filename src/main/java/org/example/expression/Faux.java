package org.example.expression;

import java.util.Map;

public final class Faux extends Expression {
    private String valeurFaux;

    public Faux(String valeurFaux) {
        this.valeurFaux = valeurFaux;
    }

    @Override
    public Boolean evalue(Map<String, Boolean> contexte) {
        Boolean valeur = contexte.getOrDefault(valeurFaux, false);
        return valeur;
    }
}
