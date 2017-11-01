package assignment8_4;
import java.util.Scanner;//packages
import java.util.concurrent.*;

class SeatReservation {//Seat Reservation class
	
	 public static void main(String[] args) //main method
	    {
	    	Scanner inpScan =new Scanner(System.in);//Instantiating Scanner object
	    	System.out.println("Taking Available Seats as 10- fixed ");
	    	//taking input from the user for no of threads and no of seats
	    	System.out.println("Enter the number of threads :");
	    	int noOfThreads = inpScan.nextInt();
	    	System.out.println("Enter the number of Seats :");
	    	int noOfSeats = inpScan.nextInt();
	    	Reservation reserve = new Reservation(); //instantiating reservation class object
	    	try{
	    	ExecutorService executor = Executors.newFixedThreadPool(noOfThreads);//creating fixed thread pool based on the input entered
	    	for (int i = 0; i < noOfThreads; i++) {//loop through noOfthreads
	    		 				
	    		Person person = new Person(reserve,noOfSeats);//Instantiating Person object with reservation object and no of seats as input
				executor.execute(person);//calling executor
			}
	    	}catch(Exception e){
	    		e.printStackTrace();
	    	}
	    	finally{
	    	
	    	inpScan.close();	    	
	    	}
	    }
	    	
	            
	        	
	        
	       
	    }
	


	 
		   
	     
	  
	  



