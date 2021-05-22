package tugasAkhirPraktikum1;

public class main {
    public static void main(String[] args) {
        /// bikin array objek
        mobil[] listMobil = new mobil[5];

        /// constructor objeknya
        /*
        for (int i = 0; i < 5; i++) {
            listMobil[i] = new mobil();
        }
        */

        listMobil[0] = new mobil();
        listMobil[1] = new mobil();
        listMobil[2] = new mobil("orange", "honda", "mahmud");
        listMobil[3] = new mobil("merah", "Satria", "Ahmad");
        listMobil[4] = new mobil("hitam", "Lamborgini", "miftah");

        /// manggil method
        /*
        for (int i = 0; i < 5; i++) {
            listMobil[i].identitas();
        }
        */
        listMobil[0].identitas();
        System.out.println();
        listMobil[1].gasgasgas();
        System.out.println();
        listMobil[2].spesifikasi();
        System.out.println();
        listMobil[3].gasgasgas();
        System.out.println();
        listMobil[4].identitas();
        System.out.println();
    }
}
