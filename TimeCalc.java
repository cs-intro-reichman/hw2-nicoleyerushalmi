public class TimeCalc {
    public static void main(String[] args) {
        // input hours and min
        int hours = Integer.parseInt("" + args[0].charAt(0) + args[0].charAt(1));
        int min = Integer.parseInt("" + args[0].charAt(3) + args[0].charAt(4));
        int min_to_add = Integer.parseInt(args[1]);
        System.out.println("hours: " + hours + " minutes: " + min + " minutes too add: " + min_to_add);

        //new hours and minutes to add
        int time = min_to_add + (hours * 60) + min;
        int new_hours = (time / 60) % 24;
        int new_min = (time - ((time/60)*60));
        System.out.println(" new hour:" + new_hours + " new min: " + new_min); 
        
        // print the new hour
        if ((new_hours < 10)) {
            System.out.print("0" + new_hours);
            }
            else {System.out.print(new_hours);}  
        
        if ((new_min <10)) {
            System.out.print(":" + "0"+ new_min);  
        }
        else{System.out.print(":" + new_min);}
        


        

    }
}
