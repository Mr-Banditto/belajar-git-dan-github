package Latihan;

import java.util.Date;
import java.text.SimpleDateFormat;

class RekamMedis {
    private String kode;
    private Date tanggal;

    public RekamMedis(String kode) {
        this.kode = kode;
        this.tanggal = new Date(); // langsung isi saat objek dibuat
    }

    public String getKode() {
        return kode;
    }

    public String getTanggal() {
        SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
        return sdf.format(tanggal);
    }
}

// Komposisi: RekamMedis bagian dari Hewan, dibuat langsung
abstract class Hewan {
    private RekamMedis rekamMedis;

    public Hewan(String kodeRekam) {
        rekamMedis = new RekamMedis(kodeRekam); // komposisi
    }

    public RekamMedis getRekamMedis() {
        return rekamMedis;
    }

    public abstract String bersuara();
}

class Kucing extends Hewan {
    public Kucing(String kode) {
        super(kode);
    }

    public String bersuara() {
        return "Meong!";
    }
}

class Anjing extends Hewan {
    public Anjing(String kode) {
        super(kode);
    }

    public String bersuara() {
        return "Guk-Guk!";
    }
}

// Agregasi: Pemilik hanya memiliki referensi ke objek Hewan
class Pemilik {
    private String nama;
    private Hewan hewan;

    public Pemilik(String nama, Hewan hewan) {
        this.nama = nama;
        this.hewan = hewan; // agregasi
    }

    public String getNama() {
        return nama;
    }

    public Hewan getHewan() {
        return hewan;
    }
}

public class Main {
    public static void main(String[] args) {
        Hewan h1 = new Kucing("RI113");
        Hewan h2 = new Anjing("RI114");

        Pemilik p1 = new Pemilik("Radit", h1);
        Pemilik p2 = new Pemilik("Bandit", h2);

        cetak(p1);
        System.out.println();
        cetak(p2);
    }

    public static void cetak(Pemilik p) {
        Hewan h = p.getHewan();
        String jenis = "";

        if (h instanceof Kucing) {
            jenis = "Kucing";
        } else if (h instanceof Anjing) {
            jenis = "Anjing";
        }

        System.out.println("Nama Pemilik     : " + p.getNama());
        System.out.println("Jenis Hewan      : " + jenis);
        System.out.println("Suara Hewan      : " + h.bersuara());
        System.out.println("Kode Rekam Medis : " + h.getRekamMedis().getKode());
        System.out.println("Tanggal Dibuat   : " + h.getRekamMedis().getTanggal());
    }
}
