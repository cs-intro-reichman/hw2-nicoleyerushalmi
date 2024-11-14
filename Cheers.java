// Prints a crowd cheering output.
public class Cheers {
        public static void main(String[] args) {
	    // input
            int number = Integer.parseInt(args[1]);
            String cheer = args[0];
            cheer = cheer.toUpperCase();
            String letters = "AEFHILMNORSX";
            for(int i=0; i< cheer.length(); i ++){
                char the_char = cheer.charAt(i);
                if (letters.indexOf(the_char) == -1) {
                        System.out.println("Give me a " + the_char + ": " + the_char + "!");
                }
                else{System.out.println("Give me an " + the_char + ": " + the_char + "!");}
            }
            System.out.println("What does that apell?");
                for(int j=0; j< number; j++){
                        System.out.println(cheer + "!!!");
                }

        }
}
