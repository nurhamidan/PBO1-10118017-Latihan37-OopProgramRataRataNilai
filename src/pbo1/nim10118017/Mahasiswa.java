package pbo1.nim10118017;

/**
 *
 * @author Agung Nurhamidan
 * NAMA                 : Agung Nurhamidan
 * KELAS                : PBO1
 * NIM                  : 10118017
 * Deskripsi Program    : Menghitung rata-rata nilai mahasiswa.
 * 
 */
public class Mahasiswa {
    public int jumlahMahasiswa;
    public double[] nilai;
    public double rataRata;
    
    public void hitungRataRata() {
        double jumlahNilai = 0;
        for (int i = 0; i < nilai.length; i++) {
            jumlahNilai += nilai[i];
        }
        rataRata = jumlahNilai / jumlahMahasiswa;
        System.out.println("Maka, Rata-Rata Nilainya adalah " + rataRata);
    }
}
