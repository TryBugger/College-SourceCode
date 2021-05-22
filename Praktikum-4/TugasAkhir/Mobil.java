package TugasAkhir;

public class Mobil extends Kendaraan {
    private String warna;

    public Mobil(String model, int tahun) {
        this.model = model;
        this.tahun = tahun;
    }

    public void setWarna(String warna) {
        this.warna = warna;
    }

    public String getWarna() {
        return this.warna;
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
    public void bergerak() {
        for(int i = 0; i < this.jumlahBan; i++){
            System.out.print("Vroomm ");
        }
    }

    @Override
    public void lampuMenyala() {
        System.out.println("Lampu dalam nyala berwana " + getWarna());
    }

    public void bergerakS() {
        super.bergerak();
    }

    public void lampuMenyalaS() {
        super.lampuMenyala();
    }
}
