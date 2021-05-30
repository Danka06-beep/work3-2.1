package company;

public class FromBorrowedBookMover extends BookMover{
    protected void moveToStatus(Book book, Status requestedStatus) {
        if (requestedStatus == Status.BORROWED) {
            book.setStatus(requestedStatus);
            System.out.println(String.format("Запрос %s, обаботан", book.getStatus()));
        }
    }
}
