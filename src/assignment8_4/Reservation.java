package assignment8_4;

class Reservation//reservation class
{

    static int availableSeats = 10;//available seats taking as 10

    synchronized void reserveSeat(int requestedSeats) // synchronized method to achieve multi threading 
    {
        System.out.println(Thread.currentThread().getName() + " entered.");//printing the current thread
        //logic for the seat reservation
        if (availableSeats >= requestedSeats)//checking that available seats are greater than requested seats
        {
            System.out.println("Seat Available. Reserve now :-)");
            try
            {
            	System.out.println(requestedSeats + " seats reserved.");
                availableSeats = availableSeats - requestedSeats;//decrementing available seats
                System.out.println("Available seats after reservation :"+availableSeats);
               
                Thread.sleep(100);     
            }
            catch (InterruptedException e)
            {
                System.out.println("Thread interrupted");
            }
            

        }
        else//if seats are not available display message to user that seats are not available
        {
            System.out.println("Requested seats not available ");
        }
        System.out.println(Thread.currentThread().getName() + " leaving.");//print thread name
        System.out.println("----------------------------------------------");
    }
}
