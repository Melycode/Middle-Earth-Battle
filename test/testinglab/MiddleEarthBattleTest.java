package testinglab;
import org.junit.jupiter.api.Test;
import java.util.HashMap;
import static org.junit.jupiter.api.Assertions.*;

class MiddleEarthBattleTest {

    MiddleEarthBattle battle = new MiddleEarthBattle();

    @Test
    void kindWins() throws IllegalArgumentException {
        HashMap<String, Integer> kindBattle = new HashMap<>();
        kindBattle.put("Númenóreanos", 4);
        int resultado = battle.calculateStrength(kindBattle, battle.kindArmy);
        assertEquals(16, resultado);
    }

    @Test
    void evilWins() {
        String resultado = battle.calculateResult(4, 25);
        assertEquals("evil wins to", resultado);
    }

    @Test
    void kindWinsNotEvil() throws IllegalArgumentException {
        HashMap<String, Integer> kindBattle = new HashMap<>();
        kindBattle.put("Elfos", 5);
        int resultado = battle.calculateStrength(kindBattle, battle.kindArmy);
        assertNotEquals(10, resultado);
    }

    @Test
    void kindLoses() {
        String resultado = battle.calculateResult(1, 4);
        assertFalse(resultado.contains("wins"));
    }

    @Test
    void draw() {
        String resultado = battle.calculateResult(9, 9);
        assertTrue(resultado.contains("draw"));
    }

    @Test
    void invalidRace() {
        Exception e = assertThrows(IllegalArgumentException.class, () -> {
            HashMap<String, Integer> ejercito = new HashMap<>();
            ejercito.put("Dragones", 3);
            battle.calculateStrength(ejercito, battle.kindArmy);
        });
        assertEquals("Invalid race", e.getMessage());
    }
}