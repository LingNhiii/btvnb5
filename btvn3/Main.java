package btvn3;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Boolean a = new Boolean();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Int x: ");
        int x = scanner.nextInt();
        System.out.println(a.isPrime(x));
        System.out.println("Long z: ");
        long z = scanner.nextLong();
        System.out.println(a.isPrime(z));
        System.out.println("Float y: ");
        float y = scanner.nextFloat();
        System.out.println(a.isPrime(y));
        System.out.println("Double t: ");
        double t = scanner.nextDouble();
        System.out.println(a.isPrime(t));
    }
}
