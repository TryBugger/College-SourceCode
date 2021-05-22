public class universitas {
    private String namaUniv;
    private String akreditasi;
    private int peringkat;

    public universitas(String name, String akr) {
        setNamaUniv(name);
        setAkreditasi(akr);
        this.peringkat = 1;
    }

    public void setNamaUniv(String namaUniv) {
        this.namaUniv = namaUniv;
    }

    public void setAkreditasi(String akreditasi) {
        this.akreditasi = akreditasi;
    }

    public void setPeringkat(int peringkat) {
        this.peringkat = peringkat;
    }

    public String getNamaUniv() {
        return namaUniv;
    }
    
    public String getAkreditasi() {
        return akreditasi;
    }

    public int getPeringkat() {
        return peringkat;
    }

    public void namaUniversitas() {
        System.out.println("Nama universitas ini adalah " + getNamaUniv());
        System.out.println("Dengan akreditasi : " + getAkreditasi());
        System.out.println("Peringkat kampus ini yaitu " + getPeringkat());
    }
}
