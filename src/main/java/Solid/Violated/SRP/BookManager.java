package main.java.Solid.Violated.SRP;

import java.util.ArrayList;
import java.util.List;

// Violates SRP because the class is responsible for both book management and sending notifications.

public class BookManager {
    private List<String> books = new ArrayList<>();

    // Adds a book to the library
    public void addBook(String title, String author) {
        books.add(title + " by " + author);
        System.out.println("Book added: " + title + " by " + author);
    }

    // Deletes a book from the library
    public void deleteBook(String title) {
        books.removeIf(book -> book.startsWith(title));
        System.out.println("Book deleted: " + title);
    }

    // Sends an overdue notification to a user
    public void sendOverdueNotification(String email) {
        System.out.println("Overdue notification sent to: " + email);
    }
}


