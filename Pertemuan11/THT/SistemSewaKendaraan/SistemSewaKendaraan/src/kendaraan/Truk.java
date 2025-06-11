
package kendaraan;

import interfaces.DapatDisewa;
import interfaces.Muatan;

public class Truk extends Kendaraan implements DapatDisewa, Muatan {
    private double tarifPerHari;
    private double kapasitas;

    public Truk(String plat, String merk, int tahun, double kapasitasKg) {
        super(plat, merk, tahun);
        this.kapasitas = kapasitasKg;
        this.tarifPerHari = 600000;
    }

    @Override
    public double hitungBiayaSewa(int hari) {
        return hari * tarifPerHari;
    }

    @Override
    public boolean perluSupir() {
        return true;
    }

    @Override
    public double kapasitasMuatan() {
        return kapasitas;
    }
}
