package excercise;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class CustomerTest {
    private final String CUSTOMER_NAME = "Nico";
    private final String MOVIE_TITLE = "Harry Potter";
    private final int MOVIE_PRICE = 0;
    private final int RENTAL_DAYS = 14;
    private Customer customer;
    private Rental rental;

    @BeforeEach
    void setUp() {
        customer = new Customer(CUSTOMER_NAME);
        rental = new Rental(new Movie(MOVIE_TITLE, MOVIE_PRICE), RENTAL_DAYS);
    }

    @Test
    void addRental() {
        int a = 0;
        try{
            customer.addRental(rental);
        } catch (Exception e){
            a = 1;
        }
        assertEquals(0, a);
    }

    @Test
    void getName() {
        assertEquals(CUSTOMER_NAME, customer.getName());
    }

    @Test
    void statement() {
        customer.addRental(rental);
        String statement = "Rental Record for Nico\n"
                + "\t" + "Title" + "\t" + "\t" + "Days" + "\t" + "Amount" + "\n"
                + "\t" + "Harry Potter" + "\t" + "\t" + "14" + "\t" + "20.0" + "\n"
                + "Amount owed is " + 20.0 + "\n"
                + "You earned 1 frequent renter points";
        assertEquals(statement, customer.statement());
    }

    @Test
    void htmlStatement() {
        customer.addRental(rental);
        String statement = "<h1>Rentals for <em>" + customer.getName() + "</em></h1><p>\n"
                + "Harry Potter: 20.0<br>\n"
                + "</p>You owed <em>20.0</em><p>\n"
                + "On this rental you earned <em>1</em> frequent renter points</p>";
        assertEquals(statement, customer.htmlStatement());
    }
}