public class Biome2 {
    protected int chunkSize;
    protected int totalOre;
    protected int totalCaves;
    protected double[] orePercentage = new double[6]; // (coal, iron, copper, gold, lapis, diamond)

    public void setChunkSize(int chunkSize) {this.chunkSize = chunkSize;}

    void biomeGenerate() {
        System.out.println("Biome in this area is generating....");
        this.totalOre = (int) (chunkSize * 17000 * 0.014); // 1 chunk kisaran 17000 blok darat, 1 chunk kisaran 230 ore
        this.totalCaves = (int) (chunkSize * 0.25) + 1;
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
