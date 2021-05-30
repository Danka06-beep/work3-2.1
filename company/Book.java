package company;

public class Book {
    private  String title;
    private  String author;
    private Status status;

    public Book(String title, String author, Status status) {
        this.title = title;
        this.author = author;
        this.status = status;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "Название книги: " + title + ", автор: " + author + ", статус книги: " + status;
    }
}

