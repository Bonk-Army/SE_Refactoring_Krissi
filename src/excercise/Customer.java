package excercise;

import java.lang.*;
import java.util.*;

class Customer {
    private String customerName;
    private Vector rentals = new Vector();

    public Customer(String customerName) {
        this.customerName = customerName;
    }

    public void addRental(Rental rental) {
        rentals.addElement(rental);
    }

    public String getName() {
        return customerName;
    }

    public String statement() {
        double totalAmount = 0;
        int frequentRenterPoints = 0;
        Enumeration rentalsEnum = rentals.elements();
        String result = "Rental Record for " + this.getName() + "\n";
        result += "\t" + "Title" + "\t" + "\t" + "Days" + "\t" + "Amount" + "\n";

        while (rentalsEnum.hasMoreElements()) {
            double amount = 0;
            Rental rental = (Rental) rentalsEnum.nextElement();
            //determine amounts for rental line
            amount = amountFor(rental);
            // add frequent renter points
            frequentRenterPoints++;
            // add bonus for a two day new release rental
            if ((rental.getMovie().getPriceCode() == Movie.NEW_RELEASE) && rental.getDaysRented() > 1)
                frequentRenterPoints++;
            //show figures for this rental
            result += "\t" + rental.getMovie().getTitle() + "\t" + "\t" + rental.getDaysRented() + "\t" + String.valueOf(amount) + "\n";
            totalAmount += amount;
        }
        //add footer lines
        result += "Amount owed is " + String.valueOf(totalAmount) + "\n";
        result += "You earned " + String.valueOf(frequentRenterPoints) + " frequent renter points";
        return result;
    }

    private double amountFor(Rental each) {
        double amount = 0;
        switch (each.getMovie().getPriceCode()) {
        case Movie.REGULAR:
            amount += 2;
            if (each.getDaysRented() > 2)
                amount += (each.getDaysRented() - 2) * 1.5;
            break;
        case Movie.NEW_RELEASE:
            amount += each.getDaysRented() * 3;
            break;
        case Movie.CHILDRENS:
            amount += 1.5;
            if (each.getDaysRented() > 3)
                amount += (each.getDaysRented() - 3) * 1.5;
            break;
        }
        return amount;
    }

}
