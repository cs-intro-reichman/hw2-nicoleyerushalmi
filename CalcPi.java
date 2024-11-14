// Computes an approximation of PI.
public class CalcPi {
	public static void main(String [] args) { 
	    // input - number of terms
		int terms = Integer.parseInt(args[0]);
		double pi = 0.0;
		double minus_pi = 0;
		double count;
		// calculate pi
		for (int i = 0 ; i< terms ; i++){
			count = (2 * i) + 1;
			if (i % 2 == 0) {
				minus_pi = minus_pi + (1.0 / count);
			}
			else{
				minus_pi = minus_pi - (1.0 / count);
			}
			
		}

		pi = ((minus_pi) * 4.0);
		System.out.println("pi according to Java: " + Math.PI);
		System.out.println("pi, aapproximated:     " +  pi);

	}
}
