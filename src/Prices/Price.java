package Prices;

public abstract class Price {
    public abstract int getPrice();

    public abstract double getAmount(int daysRented);

    public int getFrequentRenterPoints(int daysRented) {
        return 1;
    }
}
