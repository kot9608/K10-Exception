package Sem2;

import java.io.File;
import java.io.FileNotFoundException;

public class Task3 {
    /**
     * Дан следующий код, исправьте его там, где требуется
     * @param args
     * @throws Exception
     */
    public static void main(String[] args) throws Exception {
        try {
            int a = 90;
            int b = 3;
            System.out.println(a / b);
            printSum(23, 234);
            int[] abc = { 1, 2 };
            abc[3] = 9;
        } catch (NullPointerException ex) {
            System.out.println("Указатель не может указывать на null!");
        } catch (IndexOutOfBoundsException ex) {
            System.out.println("Массив выходит за пределы своего размера!");
        } catch (FileNotFoundException ex) {
            System.out.println("Файл не найден!");
        } catch (ArithmeticException ex) {
            System.out.println("Нельзя делить на 0!");
        } catch (Throwable ex) {
            System.out.println("Что-то пошло не так...");
        }
    }

    public static void printSum(Integer a, Integer b) throws FileNotFoundException {
        System.out.println(a + b);
    }
}
