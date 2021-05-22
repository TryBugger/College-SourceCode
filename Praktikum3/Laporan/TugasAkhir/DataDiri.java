package TugasAkhir;

public class DataDiri {
    private String nama;
    private String nim;
    private int tinggiBadan;
    private double beratBadan;

    public DataDiri(String nama, String nim, int tinggiBadan, double beratBadan) {
        this.nama = nama;
        this.nim = nim;
        this.tinggiBadan = tinggiBadan;
        this.beratBadan = beratBadan;
    }

    public void identitas() {
        System.out.println("Nama\t\t: " + this.nama);
        System.out.println("NIM\t\t: " + this.nim);
        System.out.println("Tinggi Badan\t: " + this.tinggiBadan);
        System.out.println("Berat Badan\t: " + this.beratBadan);
    }

    public String getNama() {
        return this.nama;
    }

    public String getNim() {
        return this.nim;
    }

    public int getTinggiBadan() {
        return this.tinggiBadan;
    }

    public double getBeratBadan() {
        return this.beratBadan;
    }

    public double BMI() {
        return (this.tinggiBadan + this.beratBadan) / 2.0;
    }
}
