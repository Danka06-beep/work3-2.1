package company;

public class FromOverduedBookMover extends BookMover{
    protected void moveToStatus(Book book, Status requestedStatus) {
        if (book.getStatus() == Status.BORROWED) {
            book.setStatus(requestedStatus);
            System.out.println(String.format("Запрос %s, обаботан", book.getStatus()));
        }
    }
}
