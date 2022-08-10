package btvn2;

import java.util.Scanner;

public class Address {
    private int id;
    private String district;
    private String province;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDistrict() {
        return district;
    }

    public void setDistrict(String district) {
        this.district = district;
    }

    public String getProvince() {
        return province;
    }

    public void setProvince(String province) {
        this.province = province;
    }

    public void input(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap id: ");
        id = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Nhap district: ");
        district = scanner.nextLine();
        System.out.println("Nhap province: ");
        province = scanner.nextLine();
    }
    public void output(){
        System.out.println("ID: "+ id);
        System.out.println("District: "+district);
        System.out.println("Province: "+province);
    }
}
