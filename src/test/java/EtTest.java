import org.example.expression.Et;
import org.example.expression.Variable;
import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.assertFalse;

class EtTest {
    @Test
    void lou_est_pauvre_et_lou_est_genereux() {
        Variable louEstPauvre = new Variable("Lou est pauvre");
        Variable louEstGenereux = new Variable("Lou est genereux");

        Et et = new Et(louEstPauvre, louEstGenereux);

        Map<String,Boolean> contexte = new HashMap<>();
        contexte.put("Lou est pauvre",false);
        contexte.put("Lou est genereux",false);

        Boolean resultat = et.evalue(contexte);
        assertFalse(resultat);
    }
}
