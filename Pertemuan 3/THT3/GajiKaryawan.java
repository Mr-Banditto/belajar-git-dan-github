package THT3;

import java.util.Scanner;

public class GajiKaryawan {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan jumlah karyawan: ");
        int jumlahKaryawan = input.nextInt();
        input.nextLine();

        for (int i = 0; i < jumlahKaryawan; i++) {
            System.out.println("\nKaryawan ke-" + (i + 1));

            System.out.print("Masukkan ID: ");
            String id = input.nextLine();

            System.out.print("Masukkan Nama: ");
            String nama = input.nextLine();

            System.out.print("Masukkan shift kerja (pagi/siang/malam): ");
            String shift = input.nextLine().toLowerCase();

            System.out.print("Masukkan total jam kerja dalam seminggu: ");
            int jamKerja = input.nextInt();

            System.out.print("Masukkan jumlah hari absen: ");
            int absen = input.nextInt();
            input.nextLine();

            int tarif = 0;
            if (shift.equals("pagi")) {
                tarif = 20000;
            } else if (shift.equals("siang")) {
                tarif = 25000;
            } else if (shift.equals("malam")) {
                tarif = 30000;
            } else {
                System.out.println("Shift tidak valid. Gaji tidak dapat dihitung.");
                continue;
            }

            int jamNormal = Math.min(jamKerja, 40);
            int gajiNormal = jamNormal * tarif;

            int jamLembur = Math.max(jamKerja - 40, 0);
            int gajiLembur = jamLembur * tarif * 3 / 2;

            int totalGaji = gajiNormal + gajiLembur;

            if (jamKerja < 30) {
                totalGaji -= totalGaji * 10 / 100;
            }

            totalGaji -= absen * 100000;

            // Menampilkan hasil
            System.out.println("\n===== Slip Gaji =====");
            System.out.println("ID: " + id);
            System.out.println("Nama: " + nama);
            System.out.println("Shift: " + shift);
            System.out.println("Jam Kerja: " + jamKerja);
            System.out.println("Absen: " + absen);
            System.out.println("Total Gaji: Rp" + totalGaji);
        }

        input.close();
    }
}
