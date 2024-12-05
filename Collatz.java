// Demonstrates the Collatz conjecture.

import javax.print.DocFlavor.STRING;

public class Collatz {
	public static void main(String args[]) {
	    // input
		int seed = Integer.parseInt(args[0]);
		String mode = args[1];
		int new_number = 0;
		int steps = 0;
		// if mode verbose
		if (mode.charAt(0) == 'v') {
			for(int i = 1; i<= seed; i++){
				System.out.print(i);
				while (new_number != 1) {
					if ((new_number == 0)) {
						new_number +=1;
					}
					steps ++;
					if ((new_number % 2 == 0)) {
						new_number = new_number / 2;	
					}	
					else{
						new_number = (new_number * 3) + 1;
					}
					System.out.print(" " + new_number);
				} // close the while loop
				System.out.println(" (" + (steps + 1) + ")" );
				steps = 0;
				new_number = i + 1;
			} // close the for loop
			System.out.println("Every one of the first " + seed + " hailstone sequences reached 1.");
		}	// close the if
	
		// if mode concise
		else{ 
			System.out.println("Every one of the first " + seed + " hailstone sequences reached 1.");
		}
		
	}
}
