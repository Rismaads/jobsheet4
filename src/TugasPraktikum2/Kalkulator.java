/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TugasPraktikum2;

/**
 *
 * @author Risma
 */
public class Kalkulator implements Operasi  {
   double Bil1, Bil2;
    double jumlah, kurang, kali, bagi; 

    Kalkulator(double Bil1, double Bil2) {
        this.Bil1 = Bil1;
        this.Bil2 = Bil2;
    }
   
    Kalkulator(){};
    
    @Override
    public double penjumlahan(){
        jumlah = this.Bil1 + this.Bil2;
        return jumlah;
    }
    
    @Override
    public double pengurangan(){
        kurang = this.Bil1 - this.Bil2;
        return kurang; 
    }
    
    @Override
    public double perkalian(){
        kali = this.Bil1 * this.Bil2;
        return kali;
    }
 
    @Override
    public double pembagian(){
        bagi = this.Bil1 / this.Bil2;
        return bagi;
    } 
}
