public class dosen {
    private String namaDosen;
    private universitas univ;
    private int gaji;

    public dosen (String name, universitas college, int gajian) {
        setNamaDosen(name);
        setUniv(college);
        setGaji(gajian);
    }
    
    public void setNamaDosen(String namaDosen) {
        this.namaDosen = namaDosen;
    }

    public void setUniv(universitas univ) {
        this.univ = univ;
    }

    public void setGaji(int gaji) {
        this.gaji = gaji;
    }
    
    public String getNamaDosen() {
        return namaDosen;
    }

    public universitas getUniv() {
        return univ;
    }

    public int getGaji() {
        return gaji;
    }

    public void identitasDosen() {
        System.out.println("Dosen " + getNamaDosen());
        System.out.println("berkuliah di : " + getUniv().getNamaUniv());
        System.out.println("dengan gaji sebesar " + getGaji());
    }
}
