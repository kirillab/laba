import java.util.Arrays;
import java.util.Scanner;

public class PolynomialAction{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите количество полиномов, которые необходимо создать: ");
        int n = scanner.nextInt();
        String[] arr;
        int[] pows = new int[n];
        System.out.println("Введите степени полиномов, которые необходимо создать: ");
        for (int i = 0; i < pows.length; i++) {
            pows[i] = scanner.nextInt();
        }

        Polynomial[] polynomials;
        polynomials = Polynomial.generatePolinoms(n,pows);
        for (Polynomial item:polynomials) {
            System.out.println(item);
        }

        System.out.println("Сумма введенных вами полиномов: ");
        arr = Polynomial.sumOfPolynomials(polynomials);
        System.out.println(Arrays.toString(arr));

    }
}
