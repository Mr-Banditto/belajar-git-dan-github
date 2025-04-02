class Buku {
    private String judul;
    private String penulis;
    private int tahunTerbit;
    private boolean statusDipinjam;
    private static int jumlahBukuTersedia;

    public Buku(String judul, String penulis, int tahunTerbit) {
        this.judul = judul;
        this.penulis = penulis;
        this.tahunTerbit = tahunTerbit;
        this.statusDipinjam = false;
        jumlahBukuTersedia++;
    }

    public String getJudul() {
        return judul;
    }

    public String getPenulis() {
        return penulis;
    }

    public int getTahunTerbit() {
        return tahunTerbit;
    }

    public boolean isDipinjam() {
        return statusDipinjam;
    }

    public void pinjam() {
        if (!statusDipinjam) {
            statusDipinjam = true;
            System.out.println(judul + " telah dipinjam.");
        } else {
            System.out.println(judul + " sedang tidak tersedia.");
        }
    }

    public void kembalikan() {
        if (statusDipinjam) {
            statusDipinjam = false;
            System.out.println(judul + " telah dikembalikan.");
        }
    }
}

class Perpustakaan {
    private Buku[] koleksi;
    private int jumlahBuku;

    public Perpustakaan(int kapasitas) {
        koleksi = new Buku[kapasitas];
        jumlahBuku = 0;
    }

    public void tambahBuku(Buku buku) {
        if (jumlahBuku < koleksi.length) {
            koleksi[jumlahBuku++] = buku;
            System.out.println("Buku " + buku.getJudul() + " ditambahkan.");
        } else {
            System.out.println("Rak penuh!");
        }
    }

    public void tampilkanBuku() {
        System.out.println("Daftar Buku di Perpustakaan:");
        for (int i = 0; i < jumlahBuku; i++) {
            Buku b = koleksi[i];
            System.out.println((i + 1) + ". " + b.getJudul() + " - " + (b.isDipinjam() ? "Dipinjam" : "Tersedia"));
        }
    }
}

class User {
    private String nama;
    private String id;

    public User(String nama, String id) {
        this.nama = nama;
        this.id = id;
    }

    public void pinjamBuku(Buku buku) {
        buku.pinjam();
    }

    public void kembalikanBuku(Buku buku) {
        buku.kembalikan();
    }
}

public class Main {
    public static void main(String[] args) {
        Perpustakaan perpustakaan = new Perpustakaan(3);
        Buku b1 = new Buku("Java Programming", "James Gosling", 1995);
        Buku b2 = new Buku("Data Structures", "Mark Weiss", 2000);

        perpustakaan.tambahBuku(b1);
        perpustakaan.tambahBuku(b2);
        perpustakaan.tampilkanBuku();

        User user1 = new User("Radit", "#001");
        user1.pinjamBuku(b1);
        perpustakaan.tampilkanBuku();

        user1.kembalikanBuku(b1);
        perpustakaan.tampilkanBuku();
    }
}
