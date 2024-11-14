// Computes an approximation of PI.
public class CalcPi {
	public static void main(String [] args) { 
	    // input - number of terms
		int terms = Integer.parseInt(args[0]);
		double pi = 0.0;
		double minus_pi = 0;
		int count = -1;
		int count1 = 1;
		// calculate pi
		for (int i=0; i< (terms / 2); i++){
			count = count + 4;
			minus_pi = minus_pi - (1.0 / count);
		}
		for(int j = 0; j < (terms / 2)- 1; j++){
			count1 = count1 + 4;
			minus_pi = minus_pi + (1.0 / count1);
		}

		pi = ((1 + minus_pi) * 4);
		System.out.println("pi according to Java: 3.141592653589793");
		System.out.println("pi, aapproximated:     " +  pi);

	}
}
