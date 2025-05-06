public class App {

    public static void main(String[] args) {

        System.out.println("--------------- домашнее задание -----------------");
        System.out.println();


        Book kurochkaRyaba = new Book("Курочка ряба", 1300, "народ", 1);
        Book warAndPeace = new Book("Война и мир", 1863, "Толстой Л.Н.", 1274);

        System.out.println(kurochkaRyaba);
        System.out.println("Является ли книга большой? " + kurochkaRyaba.isBig(kurochkaRyaba.pages) );
        System.out.println("Содержит ли описание книги слово <чка> ? " + kurochkaRyaba.matches("чка") );
        System.out.println("Оценка стоимости книги сотавляет, руб.: " + kurochkaRyaba.estimatePrice() );

        System.out.println();
        System.out.println();

        System.out.println(warAndPeace);
        System.out.println("Является ли книга большой? " + warAndPeace.isBig(warAndPeace.pages) );
        System.out.println("Содержит ли описание книги слово <мира> ? " + warAndPeace.matches("мира") );
        System.out.println("Оценка стоимости книги сотавляет, руб.: " + warAndPeace.estimatePrice() );

        System.out.println();


        System.out.println("--------------- конец -----------------");


    }


}
