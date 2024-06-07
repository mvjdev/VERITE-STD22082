import org.example.expression.Faux;
import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.assertFalse;

class FauxTest {
    @Test
    void testFaux() {
        Faux faux = new Faux("Lou est pauvre");
        Map<String, Boolean> contexte = new HashMap<>();
        contexte.put("Lou est pauvre", false);
        Boolean resultat = faux.evalue(contexte);
        assertFalse(resultat);
    }
}
