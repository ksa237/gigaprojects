public class Book {

    public static int priceOfPgs = 3;

    public String title;
    public int releaseYear;
    public String author;
    public int pages;

    public Book(String title, int releaseYear, String author, int pages) {
        this.title = title;
        this.releaseYear = releaseYear;
        this.author = author;
        this.pages = pages;
    }

    @Override
    public String toString() {
        return "Книга /" + title + "/ написана в " + releaseYear + " г., в кол-ве страниц: " + pages + ", автор: " + author;
    }

    public boolean isBig(int quantity) {
        return quantity > 500;
    }

    public boolean matches(String find) {

        return title.contains(find) || author.contains(find);

    }

    public int estimatePrice() {
        int amount = pages * priceOfPgs;

        if (amount < 250) {
            return 250;
        } else {
            return amount;
        }


    }


}
