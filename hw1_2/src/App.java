import java.util.Scanner;
import static ru.netology.service.CustomsService.calculateCustoms;

class App {

    public static void main (String[] args) {

        int price;
        int weight;

        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите цену товара (в руб.): ");
        price = scanner.nextInt();

        System.out.print("Введите вес товара (в кг.): ");
        weight = scanner.nextInt();

        int result = calculateCustoms(price, weight);

        System.out.println("Размер пошлины (в руб.) составит: "+ result);

    }


}