public class guru {
    private String nama;
    private murid pelajar;
    
    public guru() {
        
    }

    public guru(String siswa) {
        this.pelajar = new murid();
        pelajar.setNama(siswa);
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getNama() {
        return nama;
    }

    public String namaSiswa() {
        return pelajar.getNama();
    }
}
