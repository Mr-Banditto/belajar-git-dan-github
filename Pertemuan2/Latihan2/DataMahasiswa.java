import java.util.Scanner;

public class DataMahasiswa {
    public static void main(String[] args) {
        // Membuat scanner untuk input pengguna
        Scanner input = new Scanner(System.in);

        // Meminta pengguna memasukkan data
        System.out.print("Masukkan Nama: ");
        String nama = input.nextLine();
        
        System.out.print("Masukkan NIM: ");
        String nim = input.nextLine();
        
        System.out.print("Masukkan Usia: ");
        int usia = input.nextInt();
        
        System.out.print("Masukkan Tinggi Badan (cm): ");
        double tinggiBadan = input.nextDouble();
        
        // Menampilkan data yang telah dimasukkan
        System.out.println("\n=== Data Mahasiswa ===");
        System.out.println("Nama         : " + nama);
        System.out.println("NIM          : " + nim);
        System.out.println("Usia         : " + usia);
        System.out.println("Tinggi Badan : " + tinggiBadan + " cm");

        // 1) Operator Aritmatika: (usia * 2) + 10 / 5 - 3
        double hasilAritmatika = (usia * 2) + 10 / 5.0 - 3;
        System.out.println("\nHasil perhitungan aritmatika: " + hasilAritmatika);

        // 2) Operator Perbandingan: Cek apakah usia lebih dari 18
        boolean usiaLebihDari18 = usia > 18;
        System.out.println("Apakah usia lebih dari 18? " + usiaLebihDari18);

        // 3) Operator Logika: Cek apakah usia > 18 DAN tinggi > 160 cm
        boolean cekLogika = (usia > 18) && (tinggiBadan > 160);
        System.out.println("Apakah usia > 18 dan tinggi > 160 cm? " + cekLogika);

        // 4) Konversi Tipe Data
        double usiaDouble = (double) usia; // Konversi int ke double
        int tinggiInt = (int) tinggiBadan; // Konversi double ke int
        
        System.out.println("\n=== Hasil Konversi Tipe Data ===");
        System.out.println("Usia (int ke double)  : " + usiaDouble);
        System.out.println("Tinggi (double ke int): " + tinggiInt);

        // Menutup scanner
        input.close();
    }
}