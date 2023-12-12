package com.javaprogram;

import java.util.Scanner;

public class SimpleCalculator {
    public SimpleCalculator() {
    }

    public static void main(String[] args) {
        System.out.println("Kalkulator");
        System.out.println("1.+");
        System.out.println("2.-");
        System.out.println("3.*");
        System.out.println("4./");
        System.out.println("=============");
        Scanner Calc = new Scanner(System.in);
        System.out.print("Masukkan Bilangan : ");
        float bil1 = Calc.nextFloat();
        System.out.print("Masukkan Bilangan : ");
        float bil2 = Calc.nextFloat();
        System.out.print("Masukkan Operasi (1-4) : ");
        int operasi = Calc.nextInt();
        float hasil;
        switch (operasi) {
            case 1:
                hasil = bil1 + bil2;
                System.out.println("Hasil dari penjumlahan berikut adalah :" + hasil);
                break;
            case 2:
                hasil = bil1 - bil2;
                System.out.println("Hasil dari pengurangan berikut adalah :" + hasil);
                break;
            case 3:
                hasil = bil1 * bil2;
                System.out.println("Hasil dari perkalian berikut adalah :" + hasil);
                break;
            case 4:
                hasil = bil1 / bil2;
                System.out.println("Hasil dari pembagian berikut adalah :" + hasil);
                break;
            default:
                System.out.println("Operator tidak valid!");
        }

    }
}
