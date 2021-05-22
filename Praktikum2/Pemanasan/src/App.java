public class App {
    public static void main(String[] args) throws Exception {
        //System.out.println("Hello, World!");

        murid wat = new murid("rangga");
        String guruWat = wat.namaGuru();
        System.out.println(guruWat);

        guru rangga = new guru("wat");
        String muridRangga = rangga.namaSiswa();
        System.out.println(muridRangga);
        
        
    }
}
