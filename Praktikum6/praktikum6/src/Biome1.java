public class Biome1 {
    protected int chunkSize;
    protected double[] orePercentage = new double[6];  // (coal, iron, copper, gold, lapis, diamond)

    void biomeGenerate() {
        System.out.println("Biome in this area is generating....");
    }

    void oreGenerate(double[] percentage) {
        System.out.println("Ore in this biome generating....");
        int i = 0;
        for(double item : percentage) {
            orePercentage[i] = item;
            i = i + 1;
        }
    }
}
