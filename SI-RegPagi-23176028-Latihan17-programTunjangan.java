/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author COR i5 GEN 4
 */
import java.util.Scanner;
public class programTunjangan {
  
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Input gaji pokok
        System.out.print("Masukkan gaji pokok: Rp");
        double gajiPokok = scanner.nextDouble();
        
        // Input status pernikahan
        System.out.print("Apakah Anda sudah menikah? (ya/tidak): ");
        String statusMenikah = scanner.next();
        
        // Menghitung tunjangan
        double tunjangan = 0;
        if (statusMenikah.equalsIgnoreCase("ya")) {
            tunjangan = 0.35 * gajiPokok;
        }
        
        // Menghitung total gaji
        double totalGaji = gajiPokok + tunjangan;
        
        // Output hasil
        System.out.println("\nGaji Pokok : Rp " + gajiPokok);
        System.out.println("Tunjangan  : Rp " + tunjangan);
        System.out.println("Total Gaji : Rp " + totalGaji);
    }
}



