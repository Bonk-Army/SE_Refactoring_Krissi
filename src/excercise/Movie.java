package excercise;

public class Movie {
    public static final int CHILDRENS = 2;
    public static final int REGULAR = 0;
    public static final int NEW_RELEASE = 1;
    private String movieTitle;
    private int moviePriceCode;

    public Movie(String movieTitle, int moviePriceCode) {
        this.movieTitle = movieTitle;
        this.moviePriceCode = moviePriceCode;
    }

    public int getPriceCode() {
        return moviePriceCode;
    }

    public void setPriceCode(int arg) {
        moviePriceCode = arg;
    }

    public String getTitle() {
        return movieTitle;
    }
}