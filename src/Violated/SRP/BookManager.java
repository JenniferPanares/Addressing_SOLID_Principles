package Violated.SRP.com.solid.srp.violated;

public class BookManager
{
    public void AddBook(string title, string author)
    {
        // Logic to add a book
    }

    public void DeleteBook(string title)
    {
        // Logic to delete a book
    }

    public void SendOverdueNotification(string email)
    {
        // Logic to send overdue notification
        // VIOLATION: This class is responsible for managing books and sending notifications
    }
}
