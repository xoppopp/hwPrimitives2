public class Main {
    public static void main(String[] args) {

        int x = 500;                 // Начальный счет
        int y = 999;               // Сумма пополнения
        int bonus = y / 100;       // Количество бонусов
        int finaL;                // Итоговый баланс

        if (y >= 1000) {
            finaL = x + y + bonus;
            System.out.println(("Итоговый счет ") + finaL);
            System.out.println(("Бонусов ") + bonus);
        } else {
            finaL = x + y;
            System.out.println(("Итоговый счёт ") + finaL);
            System.out.println("Бонусов нет");
        }


    }
}
