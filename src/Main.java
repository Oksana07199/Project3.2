public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        int i = 100; // начальный счет
        int replenishment = 2200; // сумма пополнения

        int bonus;
        if (replenishment > 1000) { // оператор для проверки суммы пополнения
            bonus = replenishment / 100; //расчет суммы бонуса
        } else {
            bonus = 0;
        }
        System.out.println("Cумма бонуса:" + bonus); //вывод суммы бонуса
        System.out.println("Итоговый счет:" + (i + bonus)); //итоговая сумма с учетом бонуса
    }
}