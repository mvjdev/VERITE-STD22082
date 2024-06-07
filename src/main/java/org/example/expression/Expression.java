package org.example.expression;

import java.util.Map;

public sealed abstract class Expression permits Donc, Et, Faux, Ou, Variable, Vrai {
    public abstract Boolean evalue(Map<String, Boolean> contexte);
}
