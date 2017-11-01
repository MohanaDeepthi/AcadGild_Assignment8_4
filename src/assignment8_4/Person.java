package assignment8_4;

class Person implements Runnable //person class implementing runnable interface
{

    Reservation reserve; //instantiation varibale of Reservation class
    int requestedSeats;//requested seats variable

    public Person(Reservation reserve, int requestedSeats)//two argument constructor with Reservation and requestedSeats variables
    {
        this.reserve = reserve;
        this.requestedSeats = requestedSeats;
    }

    @Override
    public void run() //implement run method
    {
        reserve.reserveSeat(requestedSeats);//calling reserveSeat method from Reservation class
    }
}