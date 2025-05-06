public class Book {

    public static int PP = 3;

    public String title;
    public int releaseYear;
    public String author;
    public int pages;

    public Book(String title, int releaseYear, String author, int pages) {
        this.title=title;
        this.releaseYear=releaseYear;
        this.author=author;
        this.pages=pages;
    }

    @Override
    public String toString() {
        return "Книга /" + title + "/ написана в " + releaseYear + " г., в кол-ве страниц: "+ pages + ", автор: " + author;
    }

    public boolean isBig(int quantity) {
        if (quantity > 500) {
            return true;
        } else {
            return false;
        }
    }

    public boolean matches(String find) {

        if (title.contains(find) == true) {
            return true;

        } else if (author.contains(find) == true) {
            return true;

        } else {
            return false;

        }

    }

    public int estimatePrice() {
        int amount = pages * PP;


        if (amount < 250) {
            return 250;
        } else {
            return amount;
        }


    }


}
