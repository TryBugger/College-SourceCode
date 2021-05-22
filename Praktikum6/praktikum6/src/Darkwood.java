public class Darkwood extends Biome2 {
    private String woodType = "Dark Oak";

    public void biomeStats() {
        System.out.println("Currently biome stats :");
        System.out.println("Biome name : Darkwood");
        System.out.println("Chunk size : " + this.chunkSize);
        System.out.println("    Total non-air block : " + this.chunkSize * 17000);
        System.out.println("Dominant types of tree is " + this.woodType + ", total Tree : " + this.chunkSize * 4);
        System.out.println("Total caves : " + this.totalCaves + "\n");
    }

    public void oreStats() {
        System.out.println("Currently ore in darkwood biome stats :");
        System.out.println("Total Ore : " + this.totalOre);
        System.out.println("    1. Coal : " + (int) (this.totalOre * this.orePercentage[0]));
        System.out.println("    2. Iron : " + (int) (this.totalOre * this.orePercentage[1]));
        System.out.println("    3. Copper : " + (int) (this.totalOre * this.orePercentage[2]));
        System.out.println("    4. Gold : " + (int) (this.totalOre * this.orePercentage[3]));
        System.out.println("    5. Lapis : " + (int) (this.totalOre * this.orePercentage[4]));
        System.out.println("    6. Diamond : " + ((int) (this.totalOre * this.orePercentage[5])) + "\n");
    }
}
