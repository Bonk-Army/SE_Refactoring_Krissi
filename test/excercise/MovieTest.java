package excercise;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class MovieTest {
    private final String MOVIE_TITLE = "Harry Potter";
    private final int MOVIE_PRICE = 0;
    private final int NEW_MOVIE_PRICE = 1;
    private Movie movie;

    @BeforeEach
    void setUp() {
        movie = new Movie(MOVIE_TITLE, MOVIE_PRICE);
    }

    @Test
    void getPriceCode() {
        assertEquals(MOVIE_PRICE, movie.getPriceCode());
    }

    @Test
    void setPriceCode() {
        movie.setPriceCode(NEW_MOVIE_PRICE);
        assertEquals(NEW_MOVIE_PRICE, movie.getPriceCode());
    }

    @Test
    void getTitle() {
        assertEquals(MOVIE_TITLE, movie.getTitle());
    }
}