public class Pesawat extends Transportasi {
    public Pesawat(String nama, int jumlahKursi, String tujuan) {
        super(nama, jumlahKursi, tujuan);
    }

    @Override
    public double hitungHargaTiket() {
        return super.hitungHargaTiket() * 1.5;
    }

    public double hitungHargaTiket(String kelas) {
        double harga = hitungHargaTiket();
        if (kelas.equalsIgnoreCase("Bisnis")) {
            harga *= 1.25;
        } else if (kelas.equalsIgnoreCase("VIP")) {
            harga *= 1.5;
        }
        return harga;
    }
}
