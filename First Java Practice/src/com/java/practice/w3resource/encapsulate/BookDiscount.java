package com.java.practice.w3resource.encapsulate;

public class BookDiscount {
    private String title;
    private String author;
    private double price;

    public BookDiscount(String title, String author, double price) {
        this.title = title;
        this.author = author;
        this.price = price;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double applyDiscount(double percentage) {
        if (percentage > 0 && percentage <= 100) {
            return price - ((percentage / 100) * price);
        }
        return price;
    }
}

class AccessBookDiscount{
    public static void main(String[] args){
        BookDiscount bookDiscount = new BookDiscount("The Lord of the Rings", "J. R. R. Tolkien", 35);
        double discountPercentage = 10;
        System.out.printf("%s is the author of %s and it's priced for $%.2f%n",
                bookDiscount.getAuthor(),
                bookDiscount.getTitle(),
                bookDiscount.getPrice());

        if (bookDiscount.applyDiscount(discountPercentage) >= bookDiscount.getPrice()) {
            System.out.println("Sorry no discount applied.");
        }
        else {
            System.out.printf("The discount of %.0f%% as being added to the book: %s, the new price is: $%.2f from $%.2f%n",
                    discountPercentage,
                    bookDiscount.getTitle(),
                    bookDiscount.applyDiscount(discountPercentage),
                    bookDiscount.getPrice()
            );
        }

    }
}
