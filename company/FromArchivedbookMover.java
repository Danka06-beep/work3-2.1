package company;

public class FromArchivedbookMover extends BookMover{
    protected void moveToStatus(Book book, Status requestedStatus) {
        if (book.getStatus() == Status.ARCHIVED) {
            if (requestedStatus == Status.AVAILABLE) {
                book.setStatus(requestedStatus);
                System.out.println(String.format("Запрос %s, обаботан", requestedStatus));
            } else if(book.getStatus() == Status.ARCHIVED){
                System.out. println(String.format("Запрос %s, обаботан", book.getStatus()));
            }
        }
    }
}
