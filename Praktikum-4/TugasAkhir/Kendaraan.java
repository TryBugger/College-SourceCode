package TugasAkhir;

public class Kendaraan {
    protected int jumlahBan = 4;
    protected String model = "BluePrint";
    protected int tahun = 2000;

    protected void bergerak() {
        System.out.println("Kendaraan pada umumnya bersuara : Breeem Brem Brem Brem");
    }

    protected void lampuMenyala() {
        System.out.println("Dengan cahayanya yang ngejreng");
    }
}
