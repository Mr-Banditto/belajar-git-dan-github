// Kelas Produk untuk menyimpan data produk dan mengelola stok
class Produk {
    private String kodeProduk;
    private String namaProduk;
    private double harga;
    private int stok;

    public Produk(String kodeProduk, String namaProduk, double harga, int stok) 
    {
        this.kodeProduk = kodeProduk;
        this.namaProduk = namaProduk;
        this.harga = harga;
        this.stok = stok;
    }

    // Menampilkan informasi lengkap produk
    public void tampilkanInfoProduk() 
    {
        System.out.println("Kode Produk: " + kodeProduk);
        System.out.println("Nama Produk: " + namaProduk);
        System.out.println("Harga: " + harga);
        System.out.println("Stok: " + stok);
    }

    // Mengurangi stok produk jika jumlah yang diminta tersedia
    public boolean kurangiStok(int jumlah) 
    {
        if (stok >= jumlah) {
            stok -= jumlah;
            return true;
        }
        return false;
    }

    public double getHarga() 
    {
        return harga;
    }
    
    public String getNamaProduk() 
    {
        return namaProduk;
    }
}

// Kelas Pelanggan untuk menyimpan data pelanggan dan mengelola saldo
class Pelanggan {
    private String idPelanggan;
    private String nama;
    private String email;
    private double saldo;

    public Pelanggan(String idPelanggan, String nama, String email, double saldo) 
    {
        this.idPelanggan = idPelanggan;
        this.nama = nama;
        this.email = email;
        this.saldo = saldo;
    }

    // Menampilkan informasi pelanggan
    public void tampilkanInfoPelanggan() 
    {
        System.out.println("ID Pelanggan: " + idPelanggan);
        System.out.println("Nama: " + nama);
        System.out.println("Email: " + email);
        System.out.println("Saldo: " + saldo);
    }

    // Menambah saldo pelanggan
    public void topUpSaldo(double jumlah) 
    {
        saldo += jumlah;
    }

    // Mengurangi saldo pelanggan jika mencukupi
    public boolean kurangiSaldo(double jumlah) 
    {
        if (saldo >= jumlah) {
            saldo -= jumlah;
            return true;
        }
        return false;
    }
    
    public double getSaldo() 
    {
        return saldo;
    }
    
    public String getNama() 
    {
        return nama;
    }
}

// Kelas Transaksi untuk mengelola pembelian produk oleh pelanggan
class Transaksi {
    private String idTransaksi;
    private Pelanggan pelanggan;
    private Produk produk;
    private int jumlahBeli;
    private double totalHarga;

    public Transaksi(String idTransaksi, Pelanggan pelanggan, Produk produk, int jumlahBeli) 
    {
        this.idTransaksi = idTransaksi;
        this.pelanggan = pelanggan;
        this.produk = produk;
        this.jumlahBeli = jumlahBeli;
        this.totalHarga = produk.getHarga() * jumlahBeli;
    }

    // Memproses transaksi dengan mengecek saldo dan stok produk
    public void prosesTransaksi() 
    {
        if (pelanggan.getSaldo() >= totalHarga && produk.kurangiStok(jumlahBeli)) 
        {
            pelanggan.kurangiSaldo(totalHarga);
            System.out.println("Transaksi berhasil diproses.");
            tampilkanDetailTransaksi();
        } else 
        {
            System.out.println("Transaksi gagal: saldo tidak mencukupi atau stok produk kurang.");
        }
    }

    // Menampilkan detail transaksi
    public void tampilkanDetailTransaksi() 
    {
        System.out.println("ID Transaksi: " + idTransaksi);
        System.out.println("Nama Pelanggan: " + pelanggan.getNama());
        System.out.println("Produk: " + produk.getNamaProduk());
        System.out.println("Jumlah Beli: " + jumlahBeli);
        System.out.println("Total Harga: " + totalHarga);
    }
}

// Kelas utama untuk menjalankan program
public class Main {
    public static void main(String[] args) {
        // Membuat objek produk dan pelanggan
        Produk produk1 = new Produk("B001", "Laptop", 7500000, 10);
        Pelanggan pelanggan1 = new Pelanggan("A001", "Radit", "radit@email.com", 15000000);
        
        // Menampilkan info awal produk dan pelanggan
        System.out.println("Informasi Produk:");
        produk1.tampilkanInfoProduk();
        System.out.println("\nInformasi Pelanggan:");
        pelanggan1.tampilkanInfoPelanggan();
        
        // Melakukan transaksi pembelian
        System.out.println("\nProses Transaksi:");
        Transaksi transaksi1 = new Transaksi("C001", pelanggan1, produk1, 1);
        transaksi1.prosesTransaksi();
        
        // Menampilkan info setelah transaksi
        System.out.println("\nSetelah Transaksi:");
        produk1.tampilkanInfoProduk();
        pelanggan1.tampilkanInfoPelanggan();
    }
}
