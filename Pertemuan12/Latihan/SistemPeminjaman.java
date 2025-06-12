import java.util.Scanner;

class BukuTidakDitemukanException extends Exception {
    public BukuTidakDitemukanException(String pesan) {
        super(pesan);
    }
}

class DurasiPeminjamanTidakValidException extends Exception {
    public DurasiPeminjamanTidakValidException(String pesan) {
        super(pesan);
    }
}

public class SistemPeminjaman {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String[] daftarBuku = {"B101", "B102", "B103"}; 

        try {
            System.out.print("Nama Peminjam: ");
            String nama = input.nextLine();

            System.out.print("ID Buku: ");
            String id = input.nextLine().toUpperCase();

            boolean ditemukan = false;
            for (String buku : daftarBuku) {
                if (buku.equals(id)) {
                    ditemukan = true;
                    break;
                }
            }

            if (!ditemukan) {
                throw new BukuTidakDitemukanException("Error: Buku dengan ID " + id + " tidak tersedia di sistem.");
            }

            System.out.print("Durasi Peminjaman (hari): ");
            int hari = input.nextInt();

            if (hari < 1 || hari > 14) {
                throw new DurasiPeminjamanTidakValidException("Error: Durasi hanya boleh antara 1 sampai 14 hari.");
            }

            System.out.println("Berhasil! Buku " + id + " dipinjam atas nama " + nama + " selama " + hari + " hari.");

        } catch (BukuTidakDitemukanException | DurasiPeminjamanTidakValidException e) {
            System.out.println(e.getMessage());
        } catch (Exception e) {
            System.out.println("Terjadi kesalahan input. Pastikan format benar.");
        } finally {
            input.close();
            System.out.println("Program selesai. Terima kasih.");
        }
    }
}
