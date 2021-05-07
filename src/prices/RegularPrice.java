package prices;

import excercise.Movie;

public class RegularPrice extends Price{
    @Override
    public int getPrice() {
        return Movie.REGULAR;
    }

    @Override
    public double getAmount(int daysRented) {
        double amount = 2;
        if (daysRented > 2)
            amount += (daysRented - 2) * 1.5;
        return amount;
    }
}
