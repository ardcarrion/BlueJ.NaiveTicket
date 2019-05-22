/**
 * SmarterTicketMachine updates naive ticket machine
 */
public class SmarterTicketMachine
{
    // The price of a ticket from this machine.
    private int price;
    // The amount of money entered by a customer so far.
    private int balance;
    // The total amount of money collected by this machine.
    private int total;

    /**
     * Create a machine that issues tickets of the given price.
     * Note that the price must be greater than zero, and there
     * are no checks to ensure this.
     */
    
    public SmarterTicketMachine(int ticketCost)
    {
        price = ticketCost;
        balance = 0;
        total = 0;
    }
   
    /**
     * Return the price of a ticket.
     */
    public int getPrice()
    {
        return price;
    }

    /**
     * Return the amount of money already inserted for the
     * next ticket.
     */
    public int getBalance()
    {
        return balance;
    }

    /**
     * Receive an amount of money in cents from a customer.
     */
    public void insertMoney(int amount)
    {
        if (amount >= 0) {
            balance = balance + amount;
        } else {
            System.out.println("Use a positive amount: " + amount);
        }
    }
    /**
     * Set the price equal to ticketCost
     */
    public void setPrice(int ticketCost) 
    {
        price = ticketCost;
    }
    /**
     * Prints a prompt 
     */
    public void prompt() 
    {
        System.out.println("Please insert the correct amount of money.");
        System.out.println();
    }
    public void showPrice() 
    {
        System.out.println("The price of a ticket is " + price + " cents.");
    }
    /**
     * Print a ticket.
     * Update the total collected and
     * reduce the balance to zero.
     */
    public void printTicket()
    {
        // Simulate the printing of a ticket.
        int amountLeftToPay;
        amountLeftToPay = balance - price;
        if (amountLeftToPay <= 0) {
            System.out.println("##################");
            System.out.println("# The BlueJ Line");
            System.out.println("# Ticket");
            System.out.println("# " + price + " cents.");
            System.out.println("##################");
            System.out.println();
            
        // Update the total collected with the balance.
            total = total + balance;
        // Clear the balance.
            balance = balance - price;
        } else {
            
            System.out.println("You must insert at least: " +
                              (price - balance) + " cents.");
        }
    }
    
    public int refundBalance()
    {
        int amountToRefund;
        amountToRefund = balance;
        balance = 0;
        return amountToRefund;
    }
    
    public int emptyMachine() {
        int oldTotal = total;
        total = 0;
        return oldTotal;

    }
}

