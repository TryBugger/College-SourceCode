package tugasAkhirPraktikum1;

public class mobil {
    String warna;
    String merkMobil;
    String pemilik;
    int kapasitasBensin;
    int cc;
    
    // constructor
    public mobil() {
        warna = "Biru";
        merkMobil = "Daihatsu";
        pemilik = "Genji";
        kapasitasBensin = 1500;
        cc = 3000;
    }

    public mobil(String color, String merk, String owner) {
        warna = color;
        merkMobil = merk;
        pemilik = owner;
        kapasitasBensin = 1500;
        cc = 3000;
    }

    public void identitas() {
        System.out.println("Ini adalah Mobil Milik " + pemilik + ", dengan merk " + merkMobil);
    }

    public void spesifikasi() {
        System.out.println("Kapasitas Bensin : " + kapasitasBensin);
        System.out.println("Tenaga mesin : " + cc);
    }

    public void gasgasgas() {
        System.out.println("BRUUUUM BRUMM BRUMMM BRMMM");
    }
}
