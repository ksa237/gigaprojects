import java.util.Scanner;

public class App {

    static int computeDays(int year) {

        int result;
        if (year % 400 == 0) {
            result = 366;
        } else if (year % 100 == 0) {
            result = 365;
        } else if (year % 4 == 0) {
            result = 366;
        } else {
            result = 365;
        }
        return result;
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int uYear;
        int uDay;

        int score = 0;
        int days;

        while (true) {

            System.out.println("Введите год в формате уууу:");
            uYear = scanner.nextInt();
            System.out.println("Введите кол-во дней в формате ddd:");
            uDay = scanner.nextInt();

            days = computeDays(uYear);

            if (days != uDay) {
                System.out.println("Неправильно! в " + uYear + " году " + days + " дней.");
                break;
            }

            score++;
        }

        System.out.println("Набрано очков: " + score);








    }

}
