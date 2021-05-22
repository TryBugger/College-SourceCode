public class murid {
    private String nama;
    private guru pembimbing;

    public murid() {
        
    }

    public murid(String pengajar) {
        this.pembimbing = new guru();
        pembimbing.setNama(pengajar);
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getNama() {
        return nama;
    }

    public String namaGuru() {
        return pembimbing.getNama();
    }
}
