package excercise;

import Prices.ChildrenPrice;
import Prices.NewReleasePrice;
import Prices.Price;
import Prices.RegularPrice;

public class Movie {
    public static final int CHILDRENS = 2;
    public static final int REGULAR = 0;
    public static final int NEW_RELEASE = 1;
    private String movieTitle;
    private Price moviePrice;

    public Movie(String movieTitle, int moviePriceCode) {
        this.movieTitle = movieTitle;
        this.setPriceCode(moviePriceCode);
    }

    public int getPriceCode() {
        return moviePrice.getPrice();
    }

    public void setPriceCode(int arg) {
        switch (arg) {
        case REGULAR:
            this.moviePrice = new RegularPrice();
            break;
        case CHILDRENS:
            this.moviePrice = new ChildrenPrice();
            break;
        case NEW_RELEASE:
            this.moviePrice = new NewReleasePrice();
            break;
        default:
            throw new IllegalArgumentException("Incorrect Price Code");
        }
    }

    public String getTitle() {
        return movieTitle;
    }

    public double getAmount(int daysRented) {
        return moviePrice.getAmount(daysRented);
    }

    public int getFrequentRenterPoints(int daysRented) {
        if ((this.getPriceCode() == Movie.NEW_RELEASE) && daysRented > 1) {
            return 2;
        } else {
            return 1;
        }
    }
}