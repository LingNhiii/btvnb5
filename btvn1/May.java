package btvn1;

import java.util.Scanner;

public class May {
    private int maMay;
    private String kieuMay;
    private String tinhTrang;
    public void input(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap ma may: ");
        maMay= scanner.nextInt();
        scanner.nextLine();
        System.out.println("Nhap kieu may: ");
        kieuMay = scanner.nextLine();
        System.out.println("Nhap tinh trang: ");
        tinhTrang = scanner.nextLine();
    }
    public void output(){
        System.out.println("Ma may: " + maMay);
        System.out.println("Kieu may: " + kieuMay);
        System.out.println("Tinh trang: " + tinhTrang);
    }
}
