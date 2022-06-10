package leinad;

public class Main {
	//Create seperate class to add all the sysouts in the main method to run everything. Makes main method less crowded and uses more classes. 
	public static void main(String[] args) {
		Prompt prompt = new Prompt();
		
		System.out.println("|Welcome to The Terminal Casino!|\nHere you can test all sort of listed strategies in different table games!\n");
		
		prompt.askAll();
	}	
}

//Change it so that askTable only asks table... add casino introduction here. 
