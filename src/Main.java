public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        int startingScore = 100; // начальный счет
        int replenishment = 2200; // сумма пополнения

        int bonus;
        if (replenishment > 1000) {
            bonus = replenishment / 100;
        } else {
            bonus = 0;
        }
        System.out.println("Итоговая сумма:" + bonus);
    }
}