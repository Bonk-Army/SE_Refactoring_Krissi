package prices;

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

    @Override
    public int getFrequentRenterPoints(int daysRented) {
        if(daysRented < 1){
            return 2;
        }
        return 1;
    }
}
