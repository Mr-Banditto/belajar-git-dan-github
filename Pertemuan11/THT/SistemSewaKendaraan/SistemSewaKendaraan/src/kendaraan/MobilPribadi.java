
package kendaraan;

import interfaces.DapatDisewa;

public class MobilPribadi extends Kendaraan implements DapatDisewa {
    private double tarifPerHari;

    public MobilPribadi(String plat, String merk, int tahun) {
        super(plat, merk, tahun);
        this.tarifPerHari = 300000;
    }

    @Override
    public double hitungBiayaSewa(int hari) {
        return hari * tarifPerHari;
    }

    @Override
    public boolean perluSupir() {
        return false;
    }
}
