package Prices;

import excercise.Movie;

public class ChildrenPrice extends Price{

    @Override
    public int getPrice() {
        return Movie.CHILDRENS;
    }
}
