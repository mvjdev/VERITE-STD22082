package org.example.expression;

import java.util.Map;

public final class Ou extends Expression {
    private Expression expression1;
    private Expression expression2;

    public Ou(Expression expression1, Expression expression2) {
        this.expression1 = expression1;
        this.expression2 = expression2;
    }

    @Override
    public Boolean evalue(Map<String, Boolean> contexte) {
        Boolean valeur1 = expression1.evalue(contexte);
        Boolean valeur2 = expression2.evalue(contexte);

        return valeur1 || valeur2;
    }
}
