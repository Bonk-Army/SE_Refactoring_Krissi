package excercise;

import prices.ChildrenPrice;
import prices.NewReleasePrice;
import prices.Price;
import prices.RegularPrice;

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
        return moviePrice.getFrequentRenterPoints(daysRented);
    }
}