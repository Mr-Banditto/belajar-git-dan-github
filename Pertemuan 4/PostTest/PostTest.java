// Kelas Mobil
class Mobil {
    private String nomorPlat;
    private String merek;
    private double hargaSewaPerHari;
    private boolean tersedia;

    // Konstruktor default
    public Mobil() {
        this("Tidak Diketahui", "Tidak Diketahui", 0.0, true);
    }

    // Konstruktor berparameter
    public Mobil(String nomorPlat, String merek, double hargaSewaPerHari, boolean tersedia) {
        this.nomorPlat = nomorPlat;
        this.merek = merek;
        this.hargaSewaPerHari = hargaSewaPerHari;
        this.tersedia = tersedia;
    }

    // Getter dan Setter
    public String getNomorPlat() { 
        return nomorPlat; 
    }
    public String getMerek() {
        return merek; 
    }
    public double getHargaSewaPerHari() {
        return hargaSewaPerHari; 
    }
    public boolean isTersedia() {
        return tersedia; 
    }
    public void setTersedia(boolean tersedia) {
        this.tersedia = tersedia; 
    }

    // Menampilkan informasi mobil
    public void tampilkanInfo() {
        System.out.println("Nomor Plat: " + nomorPlat + " | Merek: " + merek + " | Harga Sewa: " + Utility.formatMataUang(hargaSewaPerHari) + " | Tersedia: " + (tersedia ? "Ya" : "Tidak"));
    }
}

// Kelas Pelanggan
class Pelanggan {
    private String nama;
    private String nomorKTP;
    private String nomorHP;

    public Pelanggan(String nama, String nomorKTP, String nomorHP) {
        this.nama = nama;
        this.nomorKTP = nomorKTP;
        this.nomorHP = nomorHP;
    }

    public void tampilkanInfo() {
        System.out.println("Nama: " + nama + " | KTP: " + nomorKTP + " | HP: " + nomorHP);
    }
}

// Kelas Utility
class Utility {
    public static double hitungDiskon(double totalBiaya, int durasi) {
        return (durasi > 5) ? totalBiaya * 0.1 : 0;
    }

    public static String formatMataUang(double jumlah) {
        return String.format("Rp%,.2f", jumlah);
    }
}

// Kelas Sewa
class Sewa {
    private Pelanggan pelanggan;
    private Mobil mobil;
    private int durasi;
    private double totalBiaya;
    private boolean berhasil;

    public Sewa(Pelanggan pelanggan, Mobil mobil, int durasi) {
        this.pelanggan = pelanggan;
        this.mobil = mobil;
        this.durasi = durasi;
        prosesPenyewaan();
    }

    private void prosesPenyewaan() {
        if (mobil.isTersedia()) {
            double biayaAwal = mobil.getHargaSewaPerHari() * durasi;
            double diskon = Utility.hitungDiskon(biayaAwal, durasi);
            totalBiaya = biayaAwal - diskon;
            mobil.setTersedia(false);
            berhasil = true;
        } else {
            berhasil = false;
        }
    }

    public void tampilkanStruk() {
        System.out.println("=== Struk Penyewaan ===");
        pelanggan.tampilkanInfo();
        mobil.tampilkanInfo();
        System.out.println("Durasi Sewa: " + durasi + " hari");
        System.out.println("Total Biaya: " + Utility.formatMataUang(totalBiaya));
        System.out.println("Status: " + (berhasil ?  "Berhasil" : "Gagal - Mobil tidak tersedia"));
    }
}

// Kelas Main
public class PostTest {
    public static void main(String[] args) {
        Mobil m1 = new Mobil("A 1234 ABC", "Toyota Avanza", 300000, true);
        Mobil m2 = new Mobil("B 5678 DEF", "TOyota Alphard", 500000, true);
        Pelanggan p1 = new Pelanggan("Radit", "1234567890", "081234567890");

        System.out.println("Daftar Mobil:");
        m1.tampilkanInfo();
        m2.tampilkanInfo();

        Sewa sewa1 = new Sewa(p1, m1, 6);
        sewa1.tampilkanStruk();

        System.out.println("Status Mobil Setelah Penyewaan:");
        m1.tampilkanInfo();
        m2.tampilkanInfo();
    }
}
