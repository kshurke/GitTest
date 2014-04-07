public class Birthday {
	 public static void main(String[] args) { 
	        int M = 365;     // number of days
	        int people = 0;   // total number of people
	        boolean[] days = new boolean[M];
	        while (true) {
	            people++;
	            int d = (int) (M * Math.random()); 
	            if (days[d]) break;                   
	            days[d] = true;  
	            
	        }
	        System.out.println(people);
	    }
	}

