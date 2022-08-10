package btvn1;

import java.util.Scanner;

public class QuanLy {
    private int maQL;
    private String hoTen;
    public void input(){
        Scanner scanner=new Scanner(System.in);
        System.out.println("Nhap ma quan ly: ");
        maQL = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Nhap ho ten: ");
        hoTen= scanner.nextLine();
    }
    public void output(){
        System.out.println("Ma quan ly: "+ maQL);
        System.out.println("Ho ten: "+ hoTen);
    }
}
