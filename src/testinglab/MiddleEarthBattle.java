package testinglab;
import java.util.HashMap;

public class MiddleEarthBattle {

	HashMap<String, Integer> kindArmy = new HashMap<>(); 
	HashMap<String, Integer> evilArmy = new HashMap<>(); 
	
	
	public MiddleEarthBattle() {
		
		kindArmy.put("Pelosos", 1); 
		kindArmy.put("Sureños buenos", 2); 
		kindArmy.put("Enanos", 3); 
		kindArmy.put("Númenóreanos", 4); 
		kindArmy.put("Elfos", 5); 
	
		
		evilArmy.put("Sureños malos", 2); 
		evilArmy.put("Orcos", 2); 
		evilArmy.put("Goblins", 2); 
		evilArmy.put("Huargos", 3); 
		evilArmy.put("Trolls", 5); 
	}
	
	
	public void battleForTheMiddleEarth(HashMap<String, Integer> kindBattle, HashMap<String, Integer> evilBattle) {
	    int kindPoints = calculateStrength(kindBattle, kindArmy);
	    int evilPoints = calculateStrength(evilBattle, evilArmy);
	    
	    String kindName = kindBattle.keySet().iterator().next();
	    String evilName = evilBattle.keySet().iterator().next();
	    int kindCount = kindBattle.values().iterator().next();
	    int evilCount = evilBattle.values().iterator().next();

	    String result = calculateResult(kindPoints, evilPoints);
	    System.out.println(kindCount + " " + kindName + " (" + kindPoints + ") " + result + " " + evilCount + " " + evilName + " (" + evilPoints + ").");
	}
	
	public int calculateStrength(HashMap<String, Integer> battle, HashMap<String, Integer> army) throws IllegalArgumentException {
	    int points = 0;
	    for (HashMap.Entry<String, Integer> entry : battle.entrySet()) {
	        if (!army.containsKey(entry.getKey())) {
	            throw new IllegalArgumentException("Invalid race");
	        }
	        points += entry.getValue() * army.get(entry.getKey());
	    }
	    return points;
	}
	
	public String calculateResult(int kindPoints, int evilPoints) {
	    if (kindPoints > evilPoints) {
	        return "kind wins to";
	    } else if (evilPoints > kindPoints) {
	        return "evil wins to ";
	    } else {
	        return "draw";
	    }
	}
}
	
