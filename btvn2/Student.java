package btvn2;

import java.util.Scanner;

public class Student {
    public int id;
    private String name;
    private int age;
    Address add;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Address getAdd() {
        return add;
    }

    public void setAdd(Address add) {
        this.add = add;
    }

    public void input(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap id: ");
        id = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Nhap ten: ");
        name = scanner.nextLine();
        System.out.println("Nhap tuoi: ");
        age = scanner.nextInt();
        add = new Address();
        add.input();
    }

    public void output(){
        System.out.println("ID: " + id);
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        add.output();
    }

}
