package TugasAkhir;

public class app {
    public static void main(String[] args) {
        Hero dawnbreaker = new Hero("Dawnbreaker", 500, 60);
        HeroAnimation heroAnimasi = new HeroAnimation();

        dawnbreaker.animation(heroAnimasi);

        dawnbreaker.stats();
        dawnbreaker.menyerang();
        dawnbreaker.animasi().rest();
        dawnbreaker.menyerang();
        dawnbreaker.animasi().idle();
        dawnbreaker.menyerang();
    }
}