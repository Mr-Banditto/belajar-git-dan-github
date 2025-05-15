package PostTest;

import java.time.LocalDate;
import java.util.UUID;

public class ProgramUtama {

    static class Vehicle {
        void startEngine() {
            System.out.println("Mesin Nyala");
        }
    }

    static class Car extends Vehicle {
        void startEngine() {
            System.out.println("Mesin Mobil Nyala");
        }
    }

    static class Motorcycle extends Vehicle {
        void startEngine() {
            System.out.println("Mesin Motor Nyala");
        }
    }

    static class License {
        private String nomorLisensi;
        private LocalDate berlakuHingga;

        public License() {
            nomorLisensi = UUID.randomUUID().toString().substring(0, 8).toUpperCase();
            berlakuHingga = LocalDate.now().plusYears(5);
        }

        public String getNomorLisensi() {
            return nomorLisensi;
        }

        public String getTanggalBerlaku() {
            return berlakuHingga.toString();
        }
    }

    static class Driver {
        private String nama;
        private Vehicle kendaraan;
        private License lisensi;

        public Driver(String nama, Vehicle kendaraan) {
            this.nama = nama;
            this.kendaraan = kendaraan;
            this.lisensi = new License();
        }

        public void tampilkanData() {
            System.out.println("Nama Pengemudi   : " + nama);

            if (kendaraan instanceof Car) {
                System.out.println("Jenis Kendaraan  : Car");
            } else if (kendaraan instanceof Motorcycle) {
                System.out.println("Jenis Kendaraan  : Motorcycle");
            } else {
                System.out.println("Jenis Kendaraan  : Tidak diketahui");
            }

            System.out.print("Status Mesin     : ");
            kendaraan.startEngine();

            System.out.println("Nomor Lisensi    : " + lisensi.getNomorLisensi());
            System.out.println("Berlaku Sampai   : " + lisensi.getTanggalBerlaku());
        }
    }

    public static void main(String[] args) {
        Driver pengemudi1 = new Driver("Radit", new Car());
        Driver pengemudi2 = new Driver("Bandit", new Motorcycle());

        pengemudi1.tampilkanData();
        System.out.println();
        pengemudi2.tampilkanData();
    }
}
