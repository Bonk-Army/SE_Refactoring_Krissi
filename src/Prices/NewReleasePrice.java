package Prices;

import excercise.Movie;

public class NewReleasePrice extends Price{
    @Override
    public int getPrice() {
        return Movie.NEW_RELEASE;
    }

    @Override
    public double getAmount(int daysRented) {
        return daysRented * 3;
    }
}
