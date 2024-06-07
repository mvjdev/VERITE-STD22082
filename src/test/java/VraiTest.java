import org.example.expression.Vrai;
import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.assertTrue;

class VraiTest {
    @Test
    void testVrai() {
        Vrai vrai = new Vrai("Lou est beau");
        Map<String, Boolean> contexte = new HashMap<>();
        contexte.put("Lou est beau", true);
        Boolean resultat = vrai.evalue(contexte);
        assertTrue(resultat);
    }
}
