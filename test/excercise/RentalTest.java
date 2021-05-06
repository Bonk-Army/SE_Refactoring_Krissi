package excercise;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class RentalTest {
    final String MOVIE_TITLE = "Harry Potter";
    final int MOVIE_PRICE = 0;
    final int RENTAL_DAYS = 14;
    Movie movie;
    Rental rental;

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