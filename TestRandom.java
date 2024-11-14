// Tests the distribution generated by Java's Math.random() function.
public  class  TestRandom {
	public static void main(String[] args) {
	    // get input
		int number_test = Integer.parseInt(args[0]);
		int more = 0;
		int less = 0;
		double ratio = 0.0;
		for(int i = 0; i<= number_test; i ++ ){
			double number = Math.random();
			if (number <= 0.5) {
				less += 1;
			} 
			else{more += 1 ;}
			 }

		if ((more > 0)) {
			ratio = (less/more);
		}
		
		System.out.println("> 0.5:  " + more + " times");
		System.out.println("<= 0.5:  " +less + " times");
		System.out.println("ratio:  " + ratio);

	}
}
