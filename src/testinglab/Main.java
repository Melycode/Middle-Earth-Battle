package testinglab;
import java.util.HashMap;


public class Main {

	public static void main(String[] args) {
		
		MiddleEarthBattle batalla = new MiddleEarthBattle();
		
		// first battle 
		HashMap<String, Integer> kindBattle = new HashMap<>();
        kindBattle.put("Númenóreanos", 4);

        HashMap<String, Integer> evilBattle = new HashMap<>();
        evilBattle.put("Orcos", 2);

        batalla.battleForTheMiddleEarth(kindBattle, evilBattle);
        
        
     // second battle 
        HashMap<String, Integer> kindBattle2 = new HashMap<>();
        kindBattle2.put("Sureños buenos", 2);

        HashMap<String, Integer> evilBattle2 = new HashMap<>();
        evilBattle2.put("Trolls", 5);

        batalla.battleForTheMiddleEarth(kindBattle2, evilBattle2);
        
        // third battle 
        HashMap<String, Integer> kindBattle3 = new HashMap<>();
        kindBattle3.put("Elfos", 5);

        HashMap<String, Integer> evilBattle3 = new HashMap<>();
        evilBattle3.put("Goblins", 5);

        batalla.battleForTheMiddleEarth(kindBattle3, evilBattle3);
        
     // fourth battle 
        HashMap<String, Integer> kindBattle4 = new HashMap<>();
        kindBattle4.put("Pelosos", 1);

        HashMap<String, Integer> evilBattle4 = new HashMap<>();
        evilBattle4.put("Sureños malos", 2);

        batalla.battleForTheMiddleEarth(kindBattle4, evilBattle4);
        
        
     // Draw battle 
        HashMap<String, Integer> kindBattle5 = new HashMap<>();
        kindBattle5.put("Enanos", 3);

        HashMap<String, Integer> evilBattle5 = new HashMap<>();
        evilBattle5.put("Huargos", 3);

        batalla.battleForTheMiddleEarth(kindBattle5, evilBattle5);
        

	}

}
