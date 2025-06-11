import kendaraan.*;

public class Main {
    public static void main(String[] args) {
        Kendaraan mobil = new MobilPribadi("B1234XYZ", "Toyota", 2021);
        Kendaraan bus = new Bus("D5678ABC", "Mercedes", 2020);
        Truk truk = new Truk("F9012DEF", "Hino", 2019, 5000);

        System.out.println("--- Mobil Pribadi ---");
        mobil.tampilkanInfo();
        System.out.println("Biaya sewa 2 hari: Rp" + mobil.hitungBiayaSewa(2));
        System.out.println("Perlu Supir       : " + (mobil.perluSupir() ? "Ya" : "Tidak"));

        System.out.println("\n--- Bus ---");
        bus.tampilkanInfo();
        System.out.println("Biaya sewa 2 hari: Rp" + bus.hitungBiayaSewa(2));
        System.out.println("Perlu Supir       : " + (bus.perluSupir() ? "Ya" : "Tidak"));

        System.out.println("\n--- Truk ---");
        truk.tampilkanInfo();
        System.out.println("Biaya sewa 2 hari: Rp" + truk.hitungBiayaSewa(2));
        System.out.println("Perlu Supir       : " + (truk.perluSupir() ? "Ya" : "Tidak"));
        System.out.println("Kapasitas Muatan  : " + truk.kapasitasMuatan() + " kg");
    }
}
