package leinad;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Roulette {
	
	/**
	 *@return A number from the standard American roulette.
	 *@Note The list is a string since 00 must be included and can't be introduced as an int
	 */
	public void getNumber() {
		//allNums represents a list with all numbers in the roulette including "00" and "0"
		List<String> allNums = new ArrayList<String>();
		//Creates a list with all numbers in the roulette exluding zeros
		List<Integer> numbers = Stream.iterate(1, n -> n+1).limit(36).collect(Collectors.toList());
		//Changes the integer list to a list of strings
		for(Integer num : numbers) {
			allNums.add(num.toString());		
			}
		// Adds the standard roulette zeros to the list
		List<String> extras = Arrays.asList("0", "00");
		allNums.addAll(extras);
		System.out.println(allNums);
	}
}
