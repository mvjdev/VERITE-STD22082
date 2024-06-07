package org.example.expression;

import java.util.Map;

public final class Variable extends Expression {

    private String nom;
    public Variable(String nom) {
        this.nom = nom;
    }
    @Override
    public Boolean evalue(Map<String, Boolean> contexte) {
        return contexte.getOrDefault(nom,null);
    }
}
