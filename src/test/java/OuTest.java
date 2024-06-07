import org.example.expression.Ou;
import org.example.expression.Variable;
import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.assertFalse;

public class OuTest {
    @Test
    public void lou_est_pauvre_ou_lou_est_genereux() {
    Variable louEstBeau  = new Variable("Lou est pauvre");
    Variable louEstGenereux = new Variable("Lou est genereux");

    Ou ou = new Ou(louEstBeau, louEstGenereux);
    Map<String,Boolean> contexte = new HashMap<>();
    contexte.put("Lou est pauvre",false);
    contexte.put("Lou est genereux",false);

    Boolean resultat = ou.evalue(contexte);
    assertFalse(resultat);
    }
}
