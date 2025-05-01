import java.util.Scanner;

public class App {


    public static int incomeTaxSys(int incSum) {
        return (incSum * 6) / 100;
    }

    public static int incCostTaxSys(int incSum, int costSum) {
        return ( (incSum - costSum) * 15 ) / 100;
    }


    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);
        int earnings = 0;
        int spendings = 0;


        while (true) {

            System.out.println("Выберите операцию и введите её номер:");
            System.out.println("1. Добавить новый доход");
            System.out.println("2. Добавить новый расход");
            System.out.println("3. Выбрать систему налогообложения");

            String input = scanner.nextLine();
            if ("end".equals(input)) {
                System.out.println("Программа завершена!");
                break;
            }

            //1. Добавить новый доход
            //2. Добавить новый расход
            //3. Выбрать систему налогообложения

            int operation = Integer.parseInt(input);
            int money = 0;
            String moneyStr;

            switch (operation) {
                case 1:
                    System.out.println("Введите сумму дохода:");
                    moneyStr = scanner.nextLine();
                    money = Integer.parseInt(moneyStr);
                    earnings += money;
                    break;

                case 2:
                    System.out.println("Введите сумму расхода:");
                    moneyStr = scanner.nextLine();
                    money = Integer.parseInt(moneyStr);
                    spendings += money;
                    break;

                case 3:
                    if (earnings == 0 && spendings == 0) {
                        System.out.println("Данные для расчета налогов не вводились, сначала введите данные.");
                        break;
                    }

                    int resTax1 = incomeTaxSys(earnings);
                    int resTax2 = incCostTaxSys(earnings, spendings);

                    resTax2 = (resTax2 < 0) ? 0:resTax2; // только по второй системе НО может быть налог < 0

                    int totalResult = resTax1 - resTax2;
                    int totalResAbs = Math.abs(totalResult);

                    if (totalResult < 0) { // по "доход-расход" налог больше
                        System.out.println("Рекомендуемая система НО - УСН доход");
                        System.out.println("Ваш налог составит: " + resTax1);
                        System.out.println("Налог по другой системе составит: " + resTax2);
                        System.out.println("Экономия: " + totalResAbs);
                    } else if (totalResult == 0) { // системы налогообложения равнозначны
                        System.out.println("Можете выбрать любую систему налогообложения");
                    } else { // (totalResult > 0) по "доход" налог больше
                        System.out.println("Рекомендуемая система НО - УСН доход-расход");
                        System.out.println("Ваш налог составит: " + resTax2);
                        System.out.println("Налог по другой системе составит: " + resTax1);
                        System.out.println("Экономия: " + totalResAbs);
                    }
                    earnings=0;
                    spendings=0;
                    break;


            }
            System.out.println();
            System.out.println();

        }


    }

}
