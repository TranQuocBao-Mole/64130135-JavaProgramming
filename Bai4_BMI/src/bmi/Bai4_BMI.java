package bmi;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Bai4_BMI {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double chieuCao = nhapChieuCao(scanner);
        double canNang = nhapCanNang(scanner);
        
        double bMI = tinhBMI(chieuCao, canNang);
        hienThiKetQua(bMI);
    }

    // nhập chiều cao cân nặng
    private static double nhapChieuCao(Scanner scanner) {
        double chieuCao = 0;
        while (true) {
            try {
                System.out.print("Nhập chiều cao (m): ");
                chieuCao = scanner.nextDouble();
                if (chieuCao > 1.0 && chieuCao < 2.2) {
                    break;
                } else {
                    System.out.println("Chiều cao không hợp lý, vui lòng nhập lại.");
                }
            } catch (InputMismatchException e) {
                System.out.println("Vui lòng nhập một số hợp lệ.");
                scanner.next();
            }
        }
        return chieuCao;
    }

 
    private static double nhapCanNang(Scanner scanner) {
        double canNang = 0;
        while (true) {
            try {
                System.out.print("Nhập cân nặng (kg): ");
                canNang = scanner.nextDouble();
                if (canNang > 2 && canNang < 200) {
                    break;
                } else {
                    System.out.println("Cân nặng không hợp lý, vui lòng nhập lại.");
                }
            } catch (InputMismatchException e) {
                System.out.println("Vui lòng nhập một số hợp lệ.");
                scanner.next();
            }
        }
        return canNang;
    }

   // tính chỉ số BMI
    private static double tinhBMI(double chieuCao, double canNang) {
        return canNang / (chieuCao * chieuCao);
    }

    // in kết quả ra màn hình
    private static void hienThiKetQua(double bmi) {
        System.out.println("Chỉ số BMI: " + bmi);
        System.out.print("Tình trạng sức khỏe: ");
        if (bmi < 18.5) {
            System.out.println("Gầy");
        } else if (bmi >= 18.5 && bmi < 24.9) {
            System.out.println("Bình thường");
        } else if (bmi >= 24.9 && bmi <= 29.9) {
            System.out.println("Thừa cân");
        } else {
            System.out.println("Béo phì");
        }
    }
}
