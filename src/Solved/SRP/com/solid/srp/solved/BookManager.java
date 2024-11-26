package Solved.SRP.com.solid.srp.solved;

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
}

public class NotificationService
{
    public void SendOverdueNotification(string email)
    {
        // Logic to send overdue notification
        // ADHERES TO SRP: Separate class for notification functionality
    }
}

