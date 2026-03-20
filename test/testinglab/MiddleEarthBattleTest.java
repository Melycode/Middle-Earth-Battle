package testinglab;
import org.junit.jupiter.api.Test;
import java.util.HashMap;
import java.util.Map;
import static org.junit.jupiter.api.Assertions.*;

class MiddleEarthBattleTest {

    MiddleEarthBattle battle = new MiddleEarthBattle();

    @Test
    void calculateStrength_numenoreans4_returns16() throws IllegalArgumentException {
        Map<String, Integer> kindBattle = new HashMap<>();
        kindBattle.put("Númenóreanos", 4);
        int resultado = battle.calculateStrength(kindBattle, battle.getKindArmy());
        assertEquals(16, resultado);
    }

    @Test
    void evilWins() {
        String resultado = battle.calculateResult(4, 25);
        assertEquals("evil wins to", resultado);
    }

    @Test
    void kindWinsNotEvil() throws IllegalArgumentException {
        Map<String, Integer> kindBattle = new HashMap<>();
        kindBattle.put("Elfos", 5);
        int resultado = battle.calculateStrength(kindBattle, battle.getKindArmy());
        assertEquals(25, resultado);
    }

    @Test
    void kindLoses() {
        String resultado = battle.calculateResult(1, 4);
        assertFalse(resultado.contains("kind wins"));
    }

    @Test
    void draw() {
        String resultado = battle.calculateResult(9, 9);
        assertTrue(resultado.contains("draw"));
    }

    @Test
    void invalidRace() {
        Exception e = assertThrows(IllegalArgumentException.class, () -> {
            Map<String, Integer> army = new HashMap<>();
            army.put("Dragones", 3);
            battle.calculateStrength(army, battle.getKindArmy());
        });
        assertEquals("Invalid race", e.getMessage());
    }
}
