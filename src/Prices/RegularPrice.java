package Prices;

import excercise.Movie;

public class RegularPrice extends Price{
    @Override
    public int getPrice() {
        return Movie.REGULAR;
    }
}
