package praktikum1;


public class main {
    public static void main(String[] args) {

        int a = 1;
        System.out.println(a);
        System.out.println();

        test suatuClass = new test();
        System.out.println(suatuClass.kata1);
        System.out.println(suatuClass.nilai1);
        System.out.println();

        test sebuahClass = new test(50, "udin");
        System.out.println(sebuahClass.kata1);
        System.out.println(sebuahClass.nilai1);
        System.out.println();

        int[] kumpulanAngka = {1, 2, 3, 4, 5, 6, 7};
        System.out.println(kumpulanAngka.length);
        System.out.println(kumpulanAngka[5]);
        System.out.println();

        double[] kumpulanAngka2 = new double[3];
        kumpulanAngka2[0] = 1.2;
        kumpulanAngka2[1] = 2.4;
        kumpulanAngka2[2] = 3.6;

        System.out.println(suatuClass.nilai2);
        System.out.println(test.nilai3);
        System.out.println();
    }
}