import java.util.Scanner;
public class TestFraction {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите количество дробей, которое нужно напечатать: ");
        int k = scanner.nextInt();
        Fraction[] fractions;
        fractions = Fraction.generate(k);
        System.out.println("Полученный массив дробей: ");

        for (Fraction item:fractions) {
            System.out.println(item);
        }
        System.out.println("Сумма второй и третьей дробей: ");
        System.out.println(fractions[1].add(fractions[2]));
        System.out.println("Разность второй и третьей дробей: ");
        System.out.println(fractions[1].sub(fractions[2]));
        System.out.println("Частное второй и третьей дробей: ");
        System.out.println(fractions[1].div(fractions[2]));
        System.out.println("Произведение второй и третьей дробей: ");
        System.out.println(fractions[1].mult(fractions[2]));

        System.out.println("Массив дробей после увеличения значений с четными индексами " +
                "на величину следущей дроби: ");
        Fraction.oddIndexChange(fractions);
        for (Fraction item:fractions) {
            System.out.println(item);
        }
    }
}
