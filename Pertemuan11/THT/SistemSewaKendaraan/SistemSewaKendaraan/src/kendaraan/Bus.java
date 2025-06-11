
package kendaraan;

import interfaces.DapatDisewa;

public class Bus extends Kendaraan implements DapatDisewa {
    private double tarifPerHari;

    public Bus(String plat, String merk, int tahun) {
        super(plat, merk, tahun);
        this.tarifPerHari = 800000;
    }

    @Override
    public double hitungBiayaSewa(int hari) {
        return hari * tarifPerHari;
    }

    @Override
    public boolean perluSupir() {
        return true;
    }
}
