package leinad;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Random;
import java.util.Set;

public class Roulette {
	
	/**
	 *@return A number from the standard American roulette.
	 *@Note The list is a string since 00 must be included and can't be introduced as an int
	 */
	public void spinWheel() {
		// Key -> Number | Value -> Color
		HashMap<String, String> americanR = new HashMap<String, String>();
		
		//Extranous numbers
		americanR.put("0", "g");
		americanR.put("00", "g");
		
		//Hashmap put sequence for 1-10
		for (Integer i=1; i<11; i++) {
			String color = "r";
			//Alternating color
			if (i%2 == 0) {
				color = "b";
			}
			americanR.put(i.toString(), color);
		}
		
		//Hashmap put sequence for 11-18
		for (Integer i=11; i<19; i++) {
			String color = "b";
			//Alternating color
			if (i%2 == 0) {
				color = "r";
			}
			americanR.put(i.toString(), color);
		}
		
		//Hashmap put sequence for 11-18
		for (Integer i=19; i<29; i++) {
			String color = "r";
			//Alternating color
			if (i%2 == 0) {
				color = "b";
			}
			americanR.put(i.toString(), color);
		}
		
		//Hashmap put sequence for 11-18
		for (Integer i=29; i<37; i++) {
			String color = "b";
			//Alternating color
			if (i%2 == 0) {
				color = "r";
			}
			americanR.put(i.toString(), color);
		}
		
		//
		Set<String> keySet = americanR.keySet();
		List<String> keyList = new ArrayList<>(keySet);
		
		int length = keyList.size();
		int randIndex = new Random().nextInt(length);
		
		String randKey = keyList.get(randIndex);
		String randVal = americanR.get(randKey);
		
		System.out.println("key: " + randKey + ", value: " + randVal);
		
		
		
	}
}

/*
 * getNumber algorithm can be done in less lines since two
 * of the for loops alternate r and b and another two
 * alternate b and r 
 */
