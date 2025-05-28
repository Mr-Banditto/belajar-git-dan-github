import java.text.DecimalFormat;

public class Main {
    public static void main(String[] args) {
        Transportasi[] daftar = {
            new Bus("Bus Damri", 40, "Jakarta - Bandung"),
            new Kereta("Kereta Argo", 100, "Jakarta - Surabaya"),
            new Pesawat("Garuda Indonesia", 180, "Jakarta - Bali")
        };

        DecimalFormat formatter = new DecimalFormat("Rp #,##0.00");

        for (Transportasi t : daftar) {
            System.out.println("===============================");
            System.out.println("Nama     : " + t.getNama());
            System.out.println("Tujuan   : " + t.getTujuan());
            System.out.println("Kursi    : " + t.getJumlahKursi());
            System.out.println("Harga Ekonomi : " + formatter.format(t.hitungHargaTiket()));

            double hargaBisnis = 0, hargaVIP = 0;

            if (t instanceof Bus) {
                Bus b = (Bus) t;
                hargaBisnis = b.hitungHargaTiket("Bisnis");
                hargaVIP = b.hitungHargaTiket("VIP");
            } else if (t instanceof Kereta) {
                Kereta k = (Kereta) t;
                hargaBisnis = k.hitungHargaTiket("Bisnis");
                hargaVIP = k.hitungHargaTiket("VIP");
            } else if (t instanceof Pesawat) {
                Pesawat p = (Pesawat) t;
                hargaBisnis = p.hitungHargaTiket("Bisnis");
                hargaVIP = p.hitungHargaTiket("VIP");
            }

            System.out.println("Harga Bisnis  : " + formatter.format(hargaBisnis));
            System.out.println("Harga VIP     : " + formatter.format(hargaVIP));
            System.out.println();
        }
    }
}