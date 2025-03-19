package ru.job4j.pojo;

public class Library {

    public static void main(String[] args) {
        Book dracula = new Book("Dracula", 365);
        Book harry = new Book("Harry Potter and the philosopher's stone", 429);
        Book alchemist = new Book("The Alchemist", 300);
        Book clean = new Book("Clean code", 0);
        Book[] books = new Book[4];
        books[0] = dracula;
        books[1] = harry;
        books[2] = alchemist;
        books[3] = clean;
        for (int index = 0; index < books.length; index++) {
            Book book = books[index];
            System.out.println(book.getName() + " - " + book.getQuantity());
        }
        Book temp = books[0];
        books[0] = books[3];
        books[3] = temp;
        for (int index = 0; index < books.length; index++) {
            Book book = books[index];
            System.out.println(book.getName() + " - " + book.getQuantity());
        }
        for (int index = 0; index < books.length; index++) {
            Book book = books[index];
            if (clean.equals(books[index])) {
                System.out.println(book.getName() + " - " + book.getQuantity());
            }
        }
    }
}