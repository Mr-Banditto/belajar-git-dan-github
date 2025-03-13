import java.util.Scanner;

public class VokalChecker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Meminta pengguna memasukkan kalimat
        System.out.print("Masukkan sebuah kalimat: ");
        String kalimat = scanner.nextLine();
        
        int jumlahVokal = 0;
        String vokal = "aiueoAIUEO";

        // Menghitung jumlah huruf vokal menggunakan if-else
        for (int i = 0; i < kalimat.length(); i++) {
            char karakter = kalimat.charAt(i);
            if (vokal.indexOf(karakter) != -1) {
                jumlahVokal++;
            }
        }

        // Menentukan ganjil atau genap menggunakan switch-case
        switch (jumlahVokal % 2) {
            case 0:
                System.out.println("Jumlah vokal genap");
                break;
            case 1:
                System.out.println("Jumlah vokal ganjil");
                break;
        }

        // Menampilkan string secara terbalik menggunakan foreach
        System.out.print("Kalimat terbalik: ");
        char[] karakterArray = kalimat.toCharArray();
        for (int i = karakterArray.length - 1; i >= 0; i--) {
            System.out.print(karakterArray[i]);
        }
        System.out.println();

        scanner.close();
    }
}
