import org.example.expression.Donc;
import org.example.expression.Ou;
import org.example.expression.Variable;
import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.assertFalse;
class OuDoncTest {
    @Test
    void lou_est_beau_ou_lou_est_genereux_donc_lou_est_pauvre(){
        Variable louEstBeau = new Variable("Lou est beau");
        Variable louEstGenerous = new Variable("Lou est généreux");
        Variable louEstPauvre = new Variable("Lou est pauvre");

        Ou ou = new Ou(louEstBeau, louEstGenerous);
        Donc donc = new Donc(ou, louEstPauvre);

        Map<String, Boolean> contexte = new HashMap<>();
        contexte.put("Lou est beau", true);
        contexte.put("Lou est généreux", false);
        contexte.put("Lou est pauvre", false);

        assertFalse(donc.evalue(contexte));
    }
}
