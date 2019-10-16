package pbo1.nim10118017;

import java.util.Scanner;

/**
 *
 * @author Agung Nurhamidan
 * NAMA                 : Agung Nurhamidan
 * KELAS                : PBO1
 * NIM                  : 10118017
 * Deskripsi Program    : Ini adalah class main adalah class yang pertama dijalankan.
 * 
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Mahasiswa mahasiswa = new Mahasiswa();
        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukkan Banyaknya Mahasiswa : ");
        mahasiswa.jumlahMahasiswa = scanner.nextInt();
        mahasiswa.nilai = new double[mahasiswa.jumlahMahasiswa];
        for (int i = 0; i < mahasiswa.nilai.length; i++) {
            System.out.print("Nilai Mahasiswa ke-" + (i+1) + " : ");
            mahasiswa.nilai[i] = scanner.nextDouble();
        }
        System.out.println();
        mahasiswa.hitungRataRata();
        System.out.println("\nDeveloped by : Agung Nurhamidan");
    }
    
}
