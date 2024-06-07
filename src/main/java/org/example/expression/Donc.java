package org.example.expression;

import java.util.Map;

public final class Donc extends Expression {
    private final Expression affirmation1;
    private final Expression affirmation2;

    public Donc(Expression affirmation1, Expression affirmation2) {
        this.affirmation1 = affirmation1;
        this.affirmation2 = affirmation2;
    }
    @Override
    public Boolean evalue(Map<String, Boolean> contexte) {
        Boolean resultat1 = affirmation1.evalue(contexte);
        Boolean resultat2 = affirmation2.evalue(contexte);
        if (resultat1 == true && resultat2 == false) {
            return false;
        }
        else return true;
    }
}

