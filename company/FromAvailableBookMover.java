package company;

public class FromAvailableBookMover extends BookMover{
    protected void moveToStatus(Book book, Status requestedStatus) {
        if (book.getStatus() == Status.AVAILABLE) {
            if (requestedStatus == Status.BORROWED || requestedStatus == Status.ARCHIVED) {
                book.setStatus(requestedStatus);
                System.out.println(String.format("Запрос %s, обаботан", requestedStatus));
            } else if (book.getStatus() == Status.AVAILABLE) {
                System.out.println(String.format("Запрос %s, обаботан", book.getStatus()));
            }
        }
    }
}
