package excercise;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class CustomerTest {
    final String CUSTOMER_NAME = "Nico";
    final String MOVIE_TITLE = "Harry Potter";
    final int MOVIE_PRICE = 0;
    final int RENTAL_DAYS = 14;
    Customer customer;
    Movie movie;
    Rental rental;

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
}