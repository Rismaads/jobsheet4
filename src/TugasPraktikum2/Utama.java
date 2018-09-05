/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TugasPraktikum2;

import java.util.Scanner;

/**
 *
 * @author Risma
 */
public class Utama {
    public static void main(String[] args) {
        Scanner masukan = new Scanner(System.in);
        System.out.print("Masukan bilangan Pertama : ");
        double Bil1 = masukan.nextDouble();
        System.out.print("Masukan bilangan Kedua : ");
        double Bil2 = masukan.nextDouble();
        
        Kalkulator k = new Kalkulator(Bil1, Bil2);
        
        System.out.println("Hasil Penjumlahan : " + k.penjumlahan());
        System.out.println("Hasil Pengurangan : " + k.pengurangan());
        System.out.println("Hasil Perkalian : " + k.perkalian());
        System.out.println("Hasil Pembagian : " +k.pembagian());
        
    }
}
