package bhai;

import java.util.Scanner;
import java.util.InputMismatchException;

public class nhapXuat {
    public static void main(String[] args) {
        Double a = null, b = null;
        Scanner scanner = new Scanner(System.in);

        System.out.println("*****************************");
        System.out.println("*   Chương trình tính tổng  *");
        System.out.println("*****************************");
        while (a == null) {
            try {
                System.out.print("Nhập số a: ");
                a = scanner.nextDouble();
            } catch (InputMismatchException e) {
                System.out.println("Dữ liệu không hợp lệ. Vui lòng nhập lại.");
                scanner.next();
            }
        }

        while (b == null) {
            try {
                System.out.print("Nhập số b: ");
                b = scanner.nextDouble();
            } catch (InputMismatchException e) {
                System.out.println("Dữ liệu không hợp lệ. Vui lòng nhập lại.");
                scanner.next();
            }
        }

        System.out.println("******************************");
        System.out.println("* Kết quả: a + b = " + (a + b) + " *");
        System.out.println("******************************");
    }
}