public class Main {
    public static void main(String[] args) {

        int startedBalance = 500;                 // Начальный счет
        int amount = 999;               // Сумма пополнения
        int bonus = amount / 100;       // Количество бонусов
        int finalBalance;                // Итоговый баланс

        if (amount >= 1000) {
            finalBalance = startedBalance + amount + bonus;
            System.out.println(("Итоговый счет ") + finalBalance);
            System.out.println(("Бонусов ") + bonus);
        } else {
            finalBalance = startedBalance + amount;
            System.out.println(("Итоговый счёт ") + finalBalance);
            System.out.println("Бонусов нет");
        }


    }
}
