import org.example.expression.Donc;
import org.example.expression.Variable;
import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class DoncTest {
    @Test
    void lou_est_beau_donc_lou_est_pauvre() {
        Variable louEstBeau = new Variable("Lou est beau");
        Variable louEstPauvre = new Variable("Lou est pauvre");

        Donc donc = new Donc(louEstBeau, louEstPauvre);

        Map<String, Boolean> contexte = new HashMap<>();
        contexte.put("Lou est beau", true);
        contexte.put("Lou est pauvre", false);

        Boolean resultat = donc.evalue(contexte);
        assertFalse(resultat);
    }

    @Test
    void lou_est_pauvre_donc_lou_est_genereux() {
        Variable louEstBeau = new Variable("Lou est pauvre");
        Variable louEstPauvre = new Variable("Lou est généreux");

        Donc donc = new Donc(louEstBeau,louEstPauvre);

        Map<String,Boolean> contexte = new HashMap<>();
        contexte.put("Lou est beau",false);
        contexte.put("Lou est pauvre",false);

        Boolean resultat = donc.evalue(contexte);
        assertTrue(resultat);
    }
}
