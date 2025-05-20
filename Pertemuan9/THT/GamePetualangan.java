import java.util.Scanner;

public class GamePetualangan {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String[] usernames = new String[10];
        String[] passwords = new String[10];
        int jumlahUser = 0;

        System.out.println("=== SELAMAT DATANG ===");

        while (true) {
            System.out.println("\nMenu:");
            System.out.println("1. Daftar");
            System.out.println("2. Masuk");
            System.out.println("3. Keluar");
            System.out.print("Pilih: ");
            int menu = input.nextInt();
            input.nextLine();

            if (menu == 1) {
                System.out.print("Buat username: ");
                String user = input.nextLine();
                System.out.print("Buat password: ");
                String pass = input.nextLine();

                usernames[jumlahUser] = user;
                passwords[jumlahUser] = pass;
                jumlahUser++;

                System.out.println("Pendaftaran berhasil!");

            } else if (menu == 2) {
                System.out.print("Masukkan username: ");
                String u = input.nextLine();
                System.out.print("Masukkan password: ");
                String p = input.nextLine();

                boolean ditemukan = false;

                for (int i = 0; i < jumlahUser; i++) {
                    if (usernames[i].equals(u) && passwords[i].equals(p)) {
                        ditemukan = true;
                        break;
                    }
                }

                if (ditemukan) {
                    System.out.println("Login sukses! Mulai petualangan...\n");
                    mulaiPetualangan(input);
                } else {
                    System.out.println("Login gagal!");
                }

            } else if (menu == 3) {
                System.out.println("Sampai jumpa.");
                break;
            } else {
                System.out.println("Menu tidak dikenali.");
            }
        }

        input.close();
    }

    public static void mulaiPetualangan(Scanner input) {
        int posisi = 0;

        while (true) {
            System.out.println("Posisi kamu: " + posisi);
            System.out.println("1. Maju");
            System.out.println("2. Mundur");
            System.out.println("3. Keluar game");
            System.out.print("Pilih: ");
            int aksi = input.nextInt();
            input.nextLine(); // buang newline

            if (aksi == 1) {
                posisi++;
                kejadianAcak();
            } else if (aksi == 2) {
                posisi--;
                kejadianAcak();
            } else if (aksi == 3) {
                System.out.println("Keluar dari petualangan.");
                break;
            } else {
                System.out.println("Aksi tidak dikenal.");
            }
        }
    }

    public static void kejadianAcak() {
        int acak = (int)(Math.random() * 3);

        if (acak == 0) {
            System.out.println("Kamu menemukan pedang rusak.");
        } else if (acak == 1) {
            System.out.println("Seekor goblin muncul!");
        } else if (acak == 2) {
            System.out.println("Tidak terjadi apa-apa.");
        }
    }
}
