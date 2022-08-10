package btvn1;

import java.util.Scanner;

public class PhongMay {
    private int maPhong;
    private String tenPhong;
    private float dienTich;
    QuanLy x;
    May y;

    public int getMaPhong() {
        return maPhong;
    }

    public void setMaPhong(int maPhong) {
        this.maPhong = maPhong;
    }

    public String getTenPhong() {
        return tenPhong;
    }

    public void setTenPhong(String tenPhong) {
        this.tenPhong = tenPhong;
    }

    public float getDienTich() {
        return dienTich;
    }

    public void setDienTich(float dienTich) {
        this.dienTich = dienTich;
    }
    public void input(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap ma phong: ");
        maPhong= scanner.nextInt();
        scanner.nextLine();
        System.out.println("Nhap ten phong: ");
        tenPhong = scanner.nextLine();
        System.out.println("Nhap dien tich: ");
        dienTich = scanner.nextFloat();
        x = new QuanLy();
        y = new May();
        x.input();
        y.input();
    }

    public void output(){
        System.out.println("Ma phong: "+ maPhong);
        System.out.println("Ten phong: " + tenPhong);
        System.out.println("Dien tich: " + dienTich);
        x.output();
        y.output();
    }
}
