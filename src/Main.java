public class Main {
    public static void main(String[] args) {
        System.out.println("Hello");
        int bill = 400; // баланс рубли
        int bonus = (bill / 100); // количество бонусных рублей
        if (bill > 1000) {
            System.out.println("баланс:");
            System.out.println(bill + bonus); //баланс рубли итог
        }
        if (bill < 1000) {
            System.out.println("баланс:");
            System.out.println(bill); //баланс рубли итог
        }
        System.out.println("Bye");
    }
}