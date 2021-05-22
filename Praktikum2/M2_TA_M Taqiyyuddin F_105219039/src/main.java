public class main {
    public static void main(String[] args) {

        universitas up = new universitas("Universitas Pertamina", "A");
        up.namaUniversitas();
        System.out.println();

        mahasiswa mh1 = new mahasiswa("Udin", up, "2019");
        mh1.identitasMahasiswa();
        System.out.println();

        dosen ds1 = new dosen("Rangga", up, 10000000);
        ds1.identitasDosen();
        System.out.println();
    }
}
