package company;

public class Main {

    public static void main(String[] args) {

        Book book1 = new Book("«Мор, ученик смерти»", "«Терри пратчет»", Status.AVAILABLE);
        Book book2 = new Book("«Убийство Роджера Эйкрода»", "«Кристи Агата»", Status.BORROWED);

        System.out.println(book1);
        System.out.println(book2);

        System.out.println();

        BookMover FromAvailable = new FromAvailableBookMover();

        FromAvailable.moveToStatus(book1, Status.ARCHIVED);
        System.out.println(book1);
    }
}
