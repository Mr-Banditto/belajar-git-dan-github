package PostTest3;

import java.util.Scanner;

public class DiskonToko {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            boolean ulangi = true;
            
            while (ulangi) {
                System.out.print("Masukkan total belanja: ");
                
                // Validasi input agar harus angka
                if (!scanner.hasNextDouble()) {
                    System.out.println("Error: Masukkan angka yang valid!");
                    scanner.next(); // Membersihkan buffer
                    ulangi = true;
                } else {
                    double totalBelanja = scanner.nextDouble();
                    
                    // Validasi agar total belanja tidak negatif
                    if (totalBelanja < 0) {
                        System.out.println("Error: Total belanja tidak boleh negatif!");
                        ulangi = true;
                    } else {
                        // Menentukan diskon utama
                        double diskonUtama = (totalBelanja > 500000) ? 0.2 :
                                (totalBelanja >= 250000) ? 0.1 : 0.0;
                        
                        // Menampilkan apakah pelanggan mendapatkan diskon utama atau tidak
                        System.out.println((diskonUtama > 0) ? "Anda mendapatkan diskon utama!" : "Tidak ada diskon utama.");
                        
                        // Menghitung harga setelah diskon utama
                        double hargaSetelahDiskon = totalBelanja - (totalBelanja * diskonUtama);
                        
                        // Meminta input tipe member
                        System.out.print("Masukkan tipe member (Platinum/Gold/Silver/None): ");
                        String tipeMember = scanner.next().trim().toLowerCase();
                        
                        // Menentukan tambahan diskon berdasarkan tipe member
                        double tambahanDiskon = 0.0;
                        boolean validMember = true;
                        
                        switch (tipeMember) {
                            case "platinum" -> tambahanDiskon = 0.05;
                            case "gold" -> tambahanDiskon = 0.03;
                            case "silver" -> tambahanDiskon = 0.02;
                            case "none" -> tambahanDiskon = 0.0;
                            default -> {
                                System.out.println("Error: Tipe member tidak valid!");
                                validMember = false;
                            }
                        }
                        
                        if (validMember) {
                            // Menampilkan apakah pelanggan mendapatkan tambahan diskon atau tidak
                            System.out.println((tambahanDiskon > 0) ? "Anda mendapatkan tambahan diskon member!" : "Tidak ada tambahan diskon.");
                            
                            // Menghitung harga setelah tambahan diskon
                            double hargaFinal = hargaSetelahDiskon - (hargaSetelahDiskon * tambahanDiskon);
                            
                            // Menampilkan hasil akhir
                            System.out.println("Total belanja setelah diskon: Rp" + String.format("%.2f", hargaFinal));
                        }
                        
                        // Menanyakan apakah ingin mengulang program
                        System.out.print("Apakah ingin menghitung lagi? (ya/tidak): ");
                        String jawaban = scanner.next().trim().toLowerCase();
                        ulangi = jawaban.equals("ya");
                    }
                }
            }
            
            System.out.println("Terima kasih telah berbelanja!");
        }
    }
}