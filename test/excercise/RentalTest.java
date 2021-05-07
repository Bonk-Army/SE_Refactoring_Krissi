package excercise;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class RentalTest {
    private final String MOVIE_TITLE = "Harry Potter";
    private final int MOVIE_PRICE = 0;
    private final int RENTAL_DAYS = 14;
    private Movie movie;
    private Rental rental;

    @BeforeEach
    void setUp() {
        movie = new Movie(MOVIE_TITLE, MOVIE_PRICE);
        rental = new Rental(movie, RENTAL_DAYS);
    }

    @Test
    void getDaysRented() {
        assertEquals(RENTAL_DAYS, rental.getDaysRented());
    }

    @Test
    void getMovie() {
        assertEquals(movie, rental.getMovie());
    }
}