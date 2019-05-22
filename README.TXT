Project: naive-ticket-machine
Authors: David Barnes and Michael Kolling

This project is part of the material for the book

   Objects First with Java - A Practical Introduction using BlueJ
   Fourth edition
   David J. Barnes and Michael Kolling
   Pearson Education, 2008

It is discussed in chapter 2.

Purpose of project: To illustrate the basics of fields, constructors, and methods.
How to start this project: Create one or more TicketMachine objects.

See the doc directory for the chapter PDF

2.2 return 0
2.3 No matter how much you insert over ticket price balance is 0 after print
    You don't get a refund if you insert too much and will print a ticket
    even with less money than the price
2.5 The printed ticket has a different price listed
2.6 public class Student {}
    public class LabClass {}
2.7 It does matter, class now raises error "identifier expected" because
    public is in the wrong place
2.8 Omitting public entirely fixed the errors and it runs the same
2.9 Fields: price, balance, and total
    Constructors: public TicketMachine(int ticketCost)
    Methods: getPrice(), getBalance(), insertMoney(), printTicket()
2.10 TicketMachine shares the name of the class and only sets fields given
     the parameter ticketCost and returns nothing
2.11 int
     Student
     Server
2.12 alive
     tutor
     game
2.13 The order matters. If it's not in the right order the TicketMachine
     class diagram turns crosshatched and <identifier error> happens 
     on compile.
2.14 You must have a semicolon at the end of the line to indicate a 
     statement is complete and it causes multiple errors without one
2.15 private int status;
2.16 It belongs to class Student
2.17 It has two parameters: title of type String, and price of type double
2.18 I can guess that it has at least one field of type String and one field
     of type double with similar names to the parameter names.
2.19 
    public Pet(String petsName) {
        name = petsName;
    }
2.20 The constructor redeclares the type of price making it a different 
     variable. The code compiles but the price field is set improperly.
2.21 The methods return the values of two different fields both of type
     int. There is little difference between them.
2.22 "How much money have I put in?"
2.23 It functions as expected because the field name didn't change. 
2.24 
    public int getTotal() {
        return total;
    }
2.25 Error: "not a statement" The method is empty now.
2.26 getPrice() returns an int while printTicket returns nothing (void)
2.27 The methods don't have return statements. insertMoney doesn't need one
     to update the balance field by the input amount and it doesn't return
     anything to the user. printTicket() is writing to standard out with 
     print statements and not returning anything to the program though it
     does update the fields.
2.29 It has a return type which a constructor never has
2.30 
    public void setPrice(int ticketCost) {
        price = ticketCost;
    }
2.31 
    public void increase(int points) {
        score = score + points;
    }
2.32
    public void discount(int amount) {
        price = price - amount;
    }
2.33 @TODO cp from ticket
2.34 @TODO cp from ticket
2.35 THe showPrice methods show different outputs because they are two 
     different objects and don't share the same field values.
2.36 It would no longer print the ticket price field and now just print
     "# price cents" because "price" is a string
2.37 It treats price as part of the one string and doesn't know to insert
     the field value
2.38 If the price was constant the word price could be replaced with the
     constant numerical price i.e., "# 75 cents"
 because "price" is a string
2.37 It treats price as part of the one string and doesn't know to insert
     the field value
2.38 If the price was constant the word price could be replaced with the
     constant numerical price i.e., "# 75 cents"
 because "price" is a string
2.37 It treats price as part of the one string and doesn't know to insert
     the field value
2.38 If the price was constant the word price could be replaced with the
     constant numerical price i.e., "# 75 cents"
2.39 
2.40 The method doesn't need parameters since it only needs to access the 
     balance field
2.41 The method changes the price field correctly and since it does so its
     a mutator method
2.42 in code
2.43 
