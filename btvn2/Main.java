package btvn2;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("MENU co cac chuc nang: ");
        System.out.println("1. Nhap mot mang n sinh vien");
        System.out.println("2. Hien thi thong tin cac sinh vien");
        System.out.println("3. Tim kiem sinh vien theo ID va hien thi");
        System.out.println("4. Sua cac sinh vien co province la 'Thanh Hoa' thanh 'Hai Phong'");
        System.out.println("5. Xoa sinh vien theo ID");
        System.out.println("Vui long nhap lua chon!");
        int a = scanner.nextInt();
        if (a < 1 || a > 5) {
            System.out.println("Nhap lai lua chon!");
            a = scanner.nextInt();
        }
        if (a >= 2 && a <= 5) {
            System.out.println("Can nhap thong tin sinh vien de thuc hien cac chuc nang nay!");
            System.out.println("Nhap 1 de nhap thong tin sinh vien");
            a = scanner.nextInt();
        }
        System.out.println("1.Nhap thong tin sinh vien: ");
        int n;
        System.out.println("Nhap so sinh vien: ");
        n = scanner.nextInt();
        Student students[] = new Student[n];
        for (int i = 0; i < n; i++) {
            students[i] = new Student();
            System.out.println("Sinh vien thu " + (i + 1) + " : ");
            students[i].input();
            for (int j = 0; j < i; j++) {
                if (students[i].id == students[j].id) {
                    System.out.println("Id cua sinh vien thu " + (i + 1) + "bi trung, vui long nhap lai id");
                    students[i].id = scanner.nextInt();
                }
            }
        }
        System.out.println("Nhap chuc nang ban muon thuc hien: ");
        a = scanner.nextInt();
        if (a < 2 || a > 5) {
            System.out.println("Nhap lai chuc nang!");
            a = scanner.nextInt();
        }
        switch (a) {
            case 2: {
                System.out.println("2. Thong tin sinh vien: ");
                for (int i = 0; i < n; i++) {
                    System.out.println("Sinh vien thu " + (i + 1) + ": ");
                    students[i].output();
                }
                break;
            }
            case 3: {
                System.out.println("3. Nhap ID sinh vien can tim kiem: ");
                int find = scanner.nextInt();
                for (int i = 0; i < n; i++) {
                    if (students[i].id == find) {
                        students[i].output();
                    }
                }
                break;
            }
            case 4: {
                System.out.println("4. Sua province:");
                for (int i = 0; i < n; i++) {
                    Address address = students[i].getAdd();
                    if(address.getProvince().equals("Thanh Hoa"))
                        address.setProvince("Hai Phong");
                    students[i].output();
                }
                break;
            }
            case 5: {
                System.out.println("5.Nhap id sinh vien can xoa: ");
                int delete = scanner.nextInt();
                int index = 0;
                for (int i = 0; i < n; i++) {
                    if (students[i].id == delete) {
                        index = i;
                    }
                }
                for (int i = index; i < n - 1; i++) {
                    students[i] = students[i + 1];
                }
                n--;
                System.out.println("Thong tin cac sinh vien sau khi xoa: ");
                for (int i = 0; i < n; i++) {
                    System.out.println("Sinh vien thu " + (i + 1) + ":");
                    students[i].output();
                }
                break;
            }
        }
    }
}
