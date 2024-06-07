package org.example.expression;

import java.util.Map;

public final class Et extends Expression {
    private Expression variableGauche;
    private Expression variableDroite;

    public Et(Expression variable_gauche, Expression variable_droite) {
        this.variableGauche = variable_gauche;
        this.variableDroite = variable_droite;
    }
    @Override
    public Boolean evalue(Map<String, Boolean> contexte) {
        Boolean gaucheValue = variableGauche.evalue(contexte);
        Boolean droiteValue = variableDroite.evalue(contexte);
        if (gaucheValue == droiteValue) {
            return gaucheValue || droiteValue;
        }
        return false;
    }
}
