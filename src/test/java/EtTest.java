import org.example.expression.Et;
import org.example.expression.Variable;
import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.assertTrue;

class EtTest {
    @Test
    void lou_est_pauvre_et_lou_est_genereux() {
        Variable louEstPauvre = new Variable("Lou est pauvre");
        Variable louEstGenereux = new Variable("Lou est genereux");

        Et et = new Et(louEstPauvre, louEstGenereux);

        Map<String,Boolean> contexte = new HashMap<>();
        contexte.put("Lou est pauvre",true);
        contexte.put("Lou est genereux",true);

        Boolean resultat = et.evalue(contexte);
        assertTrue(resultat);
    }
}
