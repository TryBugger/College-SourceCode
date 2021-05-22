public class Taiga extends Biome1 {
    private int totalVillage;
    private int totalOre;
    private String woodType = "Spruce";
    private int totalTrees;
    private int totalCaves;

    public Taiga(int chunkSize, int totalVillage) {
        this.chunkSize = chunkSize;
        this.totalVillage = totalVillage;
    }

    public void biomeStats() {
        System.out.println("Currently biome stats :");
        System.out.println("Biome name : Taiga");
        System.out.println("Chunk size : " + this.chunkSize);
        System.out.println("    Total non-air block : " + this.chunkSize * 17000);
        System.out.println("Dominant types of tree is " + this.woodType + ", total Tree : " + this.totalTrees);
        System.out.println("Total caves : " + this.totalCaves);
        System.out.println("Total village : " + this.totalVillage);
        System.out.println("    Total villager :" + (this.totalVillage * 6 + (chunkSize % 4)) + "\n");
    }

    public void oreStats() {
        System.out.println("Currently ore in taiga biome stats :");
        System.out.println("Total Ore : " + this.totalOre);
        System.out.println("    1. Coal : " + (int) (this.totalOre * this.orePercentage[0]));
        System.out.println("    2. Iron : " + (int) (this.totalOre * this.orePercentage[1]));
        System.out.println("    3. Copper : " + (int) (this.totalOre * this.orePercentage[2]));
        System.out.println("    4. Gold : " + (int) (this.totalOre * this.orePercentage[3]));
        System.out.println("    5. Lapis : " + (int) (this.totalOre * this.orePercentage[4]));
        System.out.println("    6. Diamond : " + ((int) (this.totalOre * this.orePercentage[5])) + "\n");
    }

    @Override
    public void biomeGenerate() {
        System.out.println("Taiga biome is generating....");
        this.totalOre = (int) (this.chunkSize * 17000 * 0.014); // 1 chunk kisaran 17000 blok darat, 1 chunk kisaran 230 ore
        this.totalTrees = this.chunkSize * 4;
        this.totalCaves = (int) (this.chunkSize * 0.25) + 1;
    }

    @Override
    void oreGenerate(double[] percentage) {
        System.out.println("Ore in Taiga biome generating....");
        int i = 0;
        for(double item : percentage) {
            orePercentage[i] = item;
            i = i + 1;
        }
    }
}
