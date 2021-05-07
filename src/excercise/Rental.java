package excercise;

class Rental {
    private Movie movie;
    private int daysRented;

    public Rental(Movie movie, int daysRented) {
        this.movie = movie;
        this.daysRented = daysRented;
    }

    public int getDaysRented() {
        return daysRented;
    }

    public Movie getMovie() {
        return movie;
    }

    public double getAmount() {
        return this.getMovie().getAmount((this.daysRented));
    }

    public int getFrequentRenterPoints() {
        return this.getMovie().getFrequentRenterPoints(this.daysRented);
    }
}