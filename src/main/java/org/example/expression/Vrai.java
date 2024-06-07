package org.example.expression;

import java.util.Map;

public final class Vrai extends Expression {
    private final String valeurVrai;

    public Vrai(String nomVariable) {
        this.valeurVrai = nomVariable;
    }
    @Override
    public Boolean evalue(Map<String, Boolean> contexte) {
        Boolean valeur = contexte.getOrDefault(valeurVrai,null);
        return valeur != null && valeur;
    }
}
