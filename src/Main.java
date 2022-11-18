
public class Main {
    public static void main(String[] args) {
        ShopQueue shop = new ShopQueue();
        shop.getCashBoxOne().offer("Виктория");
        shop.getCashBoxTwo().offer("Альберт");
        shop.getCashBoxTwo().offer("Виктор");
        shop.getCashBoxTwo().offer("Василий");
        shop.getCashBoxTwo().offer("Андрей");

        shop.add("Лариса");
        shop.add("Галина");
        shop.add("Диана");
        shop.add("Анастасия");
        shop.add("Люцифер");

        shop.add("Мэтью Бродерик");



        System.out.println(shop);

        shop.remove();
        System.out.println(shop);


    }

}