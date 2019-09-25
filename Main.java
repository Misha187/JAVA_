import java.lang.String;

public class Main {

    public static void main_1 (String st) {

        String[] arr1 = new String[16];
        String[][] arr2 = new String[4][4];
        int[][] arr3 = new int [4][4];
        String s = "";
        int j = 0;
        int i;
        int k = 0;
        int summ1 = 0;

        // преобразую строку в одномкрный массив из строк иключая пробелы и \n
        try {
            for (i = 0; i < st.length(); i++) {
                if ((st.charAt(i) != ' ') && (st.charAt(i) != '\n')) {
                    s = s + Character.toString(st.charAt(i));
                } else {
                    arr1[j] = s;
                    s = "";
                    j = j + 1;
                }
                if (i == st.length() - 1) {
                    arr1[j] = s;
                }
            }
        } catch (ArrayIndexOutOfBoundsException ex) {
            System.out.println("Общее число заданных чисел в сроке больше необходимого для построения массива 4х4");
        }
        //преобразую одномерный массив из строк в двумерный массив из строк
        for (i=0; i<4; i++) {
            for (j=0; j<4; j++) {
                arr2[i][j] = arr1[k];
                k++;
            }
        }
        //преобразую двумерный массив из строк в двумерный массив из чисел
        try {
            for (i = 0; i < 4; i++) {
                for (j = 0; j < 4; j++) {
                    arr3[i][j] = Integer.parseInt(arr2[i][j]);
                    System.out.print(arr3[i][j] + " ");
                    summ1 = summ1 + arr3[i][j];
                }
                System.out.println();
            }
            System.out.println("Сумма элементов массива/2 = " + summ1 / 2);
        } catch (NumberFormatException ex) {
            System.out.println();
            System.out.println("В исходной строке вместо числа был задан символ! Введите корректные данные.");
        }

    }

    public static void main(String[] args) {
        main_1("10 3 1 2\n2 3 2 2\n5 6 7 1\n300 3 1 0");
	}
}
