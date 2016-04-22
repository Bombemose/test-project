
/**
 * Lav en beskrivelse af klassen TicketMachine her.
 * 
 * @author (dit navn her)
 * @version (versions nummer eller dato her)
 */
public class TicketMachine
{
    // instansvariabler - erstat eksemplet herunder med dine egne variabler
    private Ticket ticket;
    private int total;

    /**
     * Konstruktør for objekter af klassen TicketMachine
     */
    public TicketMachine()
    {
        // initialiser instansvariable
        ticket = new Ticket();
    }
    
    public void insertMoney(int amount) {
        total += amount;
    }
    
    public boolean buyTicker() {
        if(ticket.getPrice() <= total) {
            total -= ticket.getPrice();
            return true;
        }
        else {
            System.out.println("Not enough money for ticket!");
            return false;
        }
    }

}
