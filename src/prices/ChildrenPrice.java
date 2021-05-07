package prices;

import excercise.Movie;

public class ChildrenPrice extends Price{

    @Override
    public int getPrice() {
        return Movie.CHILDRENS;
    }

    @Override
    public double getAmount(int daysRented) {
        double amount = 1.5;
        if (daysRented > 3)
            amount += (daysRented - 3) * 1.5;
        return amount;
    }

}
