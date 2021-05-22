package TugasAkhir;

public class App {
    public static void main(String[] args) {
        Mobil avanza = new Mobil("Avanza", 2014);
        Truk dengklek = new Truk("Mitsubishi", 2015);
        Traktor quick = new Traktor(2, "Quick", 2017);
        
        avanza.bergerakS();
        avanza.lampuMenyalaS();
        System.out.println();

        avanza.setWarna("Biru");
        System.out.println("Data Mobil :");
        System.out.println("Model Mobil " + avanza.getModel());
        System.out.print("Tahun : " + avanza.getTahun());
        System.out.print(" Berwarna " + avanza.getWarna());
        System.out.println(" Jumlah Ban sebanyak " + avanza.getJumlahBan());

        System.out.println("Mobil Jalan Bersuara ");
        avanza.bergerak();
        avanza.lampuMenyala();

        dengklek.setJumlahKontainer(2);
        System.out.println("\n\nData Truk :");
        System.out.println("Model Truk " + dengklek.getModel());
        System.out.print("Tahun : " + dengklek.getTahun());
        System.out.print(" dengan jumlah kontainer sebanyak " + dengklek.getJumlahKontainer());
        System.out.println(" Jumlah Ban sebanyak " + dengklek.getJumlahBan() + "\n");

        System.out.println("Truk Jalan Bersuara ");
        dengklek.bergerak();
        System.out.print(" pada saat lampunya nyala ");
        dengklek.lampuMenyala();

        System.out.println("\n\nData Traktor :");
        System.out.println("Model Traktor " + quick.getModel());
        System.out.print("Tahun : " + quick.getTahun());
        System.out.println(" Jumlah Ban sebanyak " + quick.getJumlahBan() + "\n");

        System.out.println("Traktor ini Jalan Bersuara ");
        quick.bergerak();
        System.out.print(" pada saat lampunya nyala bercahaya ");
        quick.lampuMenyala();
    }
}
