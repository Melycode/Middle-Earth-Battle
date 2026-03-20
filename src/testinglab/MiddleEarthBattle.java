package testinglab;
import java.util.HashMap;
import java.util.Map; 

public class MiddleEarthBattle {

	private Map<String, Integer> kindArmy = new HashMap<>(); 
	private Map<String, Integer> evilArmy = new HashMap<>(); 
	
	
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

	public Map<String, Integer> getKindArmy() {
    	return kindArmy;
	}

	public Map<String, Integer> getEvilArmy() {
    	return evilArmy;
	}
	
	public String battleForTheMiddleEarth(Map<String, Integer> kindBattle, Map<String, Integer> evilBattle) {
	    int kindPoints = calculateStrength(kindBattle, kindArmy);
	    int evilPoints = calculateStrength(evilBattle, evilArmy);
	    
	    String kindName = kindBattle.keySet().iterator().next();
	    String evilName = evilBattle.keySet().iterator().next();
	    int kindCount = kindBattle.values().iterator().next();
	    int evilCount = evilBattle.values().iterator().next();

	    String result = calculateResult(kindPoints, evilPoints);
	    String output = kindCount + " " + kindName + " (" + kindPoints + ") " + result + " " + evilCount + " " + evilName + " (" + evilPoints + ").";

		System.out.println(output);
        return output;	
	}
	
	public int calculateStrength(Map<String, Integer> battle, Map<String, Integer> army) throws IllegalArgumentException {
	    int points = 0;
	    for (Map.Entry<String, Integer> entry : battle.entrySet()) {
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
	        return "evil wins to";
	    } else {
	        return "draw";
	    }
	}
}
	
