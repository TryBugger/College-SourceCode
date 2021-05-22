package TugasAkhir;

public class Traktor extends Kendaraan {

    public Traktor(int jumlahBan, String model, int tahun) {
        this.jumlahBan = jumlahBan;
        this.model = model;
        this.tahun = tahun;
    }

    public int getJumlahBan() {
        return this.jumlahBan;
    }

    public String getModel() {
        return this.model;
    }

    public int getTahun() {
        return this.tahun;
    }

    @Override
    protected void bergerak() {
        System.out.println("Gredek Gredek Gredek");
    }

    @Override
    protected void lampuMenyala() {
        System.out.println("Redup");
    }
}
