class Mesin {
    void hidupkan() {
        System.out.println("Mesin menyala.");
    }
}

class Mobil {
    Mesin mesin = new Mesin();

    void nyalakanMobil() {
        mesin.hidupkan();
        System.out.println("Mobil siap jalan.");
    }
}
