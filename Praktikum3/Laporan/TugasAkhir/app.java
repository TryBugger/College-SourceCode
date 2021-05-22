package TugasAkhir;

import java.io.*;
import java.util.*;

public class app {
    public static void main(String[] args) {
        DataDiri[] mahasiswa = new DataDiri[2];
        Scanner input = new Scanner(System.in);

        String nama;
        String nim;
        int tinggiBadan;
        double beratBadan;

        for(int i = 0; i < mahasiswa.length; i++) {
            System.out.println("Mahasiwa ke-" + (i+1));
            System.out.print("Nama\t\t: ");
            nama = input.nextLine();
            System.out.print("NIM\t\t: ");
            nim = input.nextLine();
            System.out.print("Tinggi Badan\t: ");
            tinggiBadan = input.nextInt();
            input.nextLine();
            System.out.print("Berat Badan\t: ");
            beratBadan = input.nextDouble();
            input.nextLine();
            mahasiswa[i] = new DataDiri(nama, nim, tinggiBadan, beratBadan);
            System.out.println("=========================");
        }
        input.close();

        /*for(int i = 0; i < mahasiswa.length; i++) {
            mahasiswa[i].identitas();
        }*/

        try {
            PrintWriter fileInput = new PrintWriter("bmi.txt");
            for(int i = 0; i < mahasiswa.length; i++) {
                fileInput.println("Mahasiwa ke-" + (i+1));
                fileInput.println("Nama\t\t: " + mahasiswa[i].getNama());
                fileInput.println("NIM\t\t: " + mahasiswa[i].getNim());
                fileInput.println("Tinggi Badan\t: " + mahasiswa[i].getTinggiBadan());
                fileInput.println("Berat Badan\t: " + mahasiswa[i].getBeratBadan());
                fileInput.println("BMI\t\t: " + mahasiswa[i].BMI());
                fileInput.println("");
            }
            fileInput.close();
        } catch(FileNotFoundException e) {
            e.printStackTrace();
        }

        try {
            File fileOutput = new File("bmi.txt");
            Scanner readFile = new Scanner(fileOutput);
            System.out.println("\nHasil Output Dari Baca File :");
            while(readFile.hasNextLine()) {
                System.out.println(readFile.nextLine());
            }
            readFile.close();
        } catch(FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}
