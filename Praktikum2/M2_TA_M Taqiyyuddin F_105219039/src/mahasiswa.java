public class mahasiswa {
    private String namaMahasiswa;
    private universitas univ;
    private String angkatan;

    public mahasiswa(String name, universitas college, String tahun) {
        setNamaMahasiswa(name);
        setUniv(college);
        setAngkatan(tahun);
    }

    public void setNamaMahasiswa(String nama) {
        namaMahasiswa = nama;
    }

    public void setUniv(universitas univ) {
        this.univ = univ;
    }
    
    public void setAngkatan(String angkatan) {
        this.angkatan = angkatan;
    }

    public String getNamaMahasiswa() {
        return namaMahasiswa;
    }

    public universitas getUniv() {
        return univ;
    }
    
    public String getAngkatan() {
        return angkatan;
    }
    
    public void identitasMahasiswa() {
        System.out.println("Mahasiswa " + getNamaMahasiswa());
        System.out.println("berkuliah di : " + getUniv().getNamaUniv());
        System.out.println("Angkatan " + getAngkatan());
    }

}
