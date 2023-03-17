import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите размерность матрицы: ");
        byte n = scanner.nextByte();

        int[][] matrix = new int[n][n];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = (int) (Math.random()*10);
            }
        }

        System.out.println("Введите строку для сортировки от 1 до " + n + ": ");

        byte k = scanner.nextByte();
        k-=1;
        System.out.println("Матрица до сортировки: ");
        printArr(matrix);

        bubbleSort(matrix, k);

        System.out.println("Матрица после сортировки: ");
        printArr(matrix);

    }

    private static void bubbleSort(int[][] matrix, int k) {
        for (int i = 0; i < matrix[k].length; i++) {
            for (int j = 0; j < matrix[k].length-1; j++) {
                if (matrix[k][j+1] < matrix[k][j]){
                    int temp = matrix[k][j+1];
                    matrix[k][j+1] = matrix[k][j];
                    matrix[k][j] = temp;

                    swapColumns(matrix, k, j);
                }
            }
        }
    }

    private static void swapColumns(int[][] matrix, int k, int j) {
        int temp;
        for (int l = 0; l < matrix.length; l++) {
            if (l == k){continue;}
            temp = matrix[l][j +1];
            matrix[l][j +1] = matrix[l][j];
            matrix[l][j] = temp;

        }
    }

    private static void printArr(int[][] matrix) {
        for (int[] item: matrix) {
            System.out.println(Arrays.toString(item));
        }
        System.out.println();
    }

}


