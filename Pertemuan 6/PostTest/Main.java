import universitas.Mahasiswa;
import universitas.ManajemenMahasiswa;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ManajemenMahasiswa manajemen = new ManajemenMahasiswa();
        int pilihan;

        do {
            System.out.println("=== MENU ===");
            System.out.println("1. Tambah Mahasiswa");
            System.out.println("2. Tampilkan Semua Mahasiswa");
            System.out.println("3. Tampilkan Mahasiswa dengan IPK Tertinggi");
            System.out.println("4. Keluar");
            System.out.print("Pilih: ");
            pilihan = sc.nextInt();
            sc.nextLine(); // Buang newline

            switch (pilihan) {
                case 1:
                    System.out.print("Masukkan NIM   : ");
                    String nim = sc.nextLine();
                    System.out.print("Masukkan Nama  : ");
                    String nama = sc.nextLine();
                    System.out.print("Masukkan Prodi : ");
                    String prodi = sc.nextLine();
                    System.out.print("Masukkan IPK   : ");
                    double ipk = sc.nextDouble();
                    sc.nextLine(); // Buang newline

                    Mahasiswa m = new Mahasiswa(nim, nama, prodi, ipk);
                    manajemen.tambahMahasiswa(m);
                    System.out.println("Data berhasil ditambahkan!\n");
                    break;

                case 2:
                    manajemen.tampilkanSemua();
                    break;

                case 3:
                    manajemen.tampilkanIPKTertinggi();
                    break;

                case 4:
                    System.out.println("Program selesai.");
                    break;

                default:
                    System.out.println("Pilihan tidak valid.");
            }

            System.out.println();

        } while (pilihan != 4);

        sc.close();
    }
}
