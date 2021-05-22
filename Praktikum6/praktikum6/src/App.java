public class App {
    public static void main(String[] args) {
        Taiga taiga1 =  new Taiga(25, 2);
        taiga1.biomeGenerate();
        double[] percentage = {0.25, 0.15, 0.15, 0.15, 0.2, 0.1}; // (coal, iron, copper, gold, lapis, diamond)
        taiga1.oreGenerate(percentage);

        System.out.println("=========================");

        taiga1.biomeStats();
        taiga1.oreStats();

        System.out.println("=========================");
        System.out.println("=                       =");
        System.out.println("=========================");

        Biome2 biome = new Darkwood();
        biome.setChunkSize(17);
        double[] percentage2 = {0.22, 0.16, 0.16, 0.16, 0.23, 0.07}; // (coal, iron, copper, gold, lapis, diamond)
        biome.biomeGenerate();
        biome.oreGenerate(percentage2);

        Darkwood darkwood1 = (Darkwood)biome;

        System.out.println("=========================");
        darkwood1.biomeStats();
        darkwood1.oreStats();
    }
}
