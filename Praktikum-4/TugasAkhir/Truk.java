package TugasAkhir;

public class Truk extends Kendaraan {
    private int jumlahKontainer = 1;

    public Truk(String model, int tahun) {
        this.model = model;
        this.tahun = tahun;
        this.jumlahBan = 6;
    }

    public void setJumlahKontainer(int jumlahKontainer) {
        this.jumlahKontainer = jumlahKontainer;
    }

    public int getJumlahKontainer() {
        return this.jumlahKontainer;
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
        System.out.println("Gruduk Brmmm Gruduk Gruduk");
    }

    @Override
    protected void lampuMenyala() {
        System.out.println("Cerah membutakan jalan");
    }
}
