import java.util.Scanner;

public class MakeFlavour {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите диапазон значений дли стебля: ");
        int x1 = scanner.nextInt();
        int x2 = scanner.nextInt();

        Flavour pack = new Flavour();
        pack.add(new Rose("red", 15, 90, 150));
        pack.add(new Rose("red", 15, 90, 150));
        pack.add(new Pion("white", 10, 100, 200));
        pack.add(new Rose("black", 13, 50, 130));
        pack.add(new SunFlower("yellow", 16, 30, 50));

        System.out.println("Поиск цветов, удовлетворяющих указанной длине стебля: ");
        pack.findForLength(x1,x2);
        System.out.println("Цена собранного букета: " + pack.getPackPrice());
        pack.SortByFresh();
        System.out.println("Букет, отсортированный по свежести: ");
        System.out.println(pack);

    }
}
