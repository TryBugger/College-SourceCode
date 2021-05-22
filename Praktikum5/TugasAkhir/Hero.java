package TugasAkhir;

public class Hero extends Character {
    private int health;
    private int damage;
    private Animation animasi;

    public Hero(String nama, int health, int damage) {
        setNama(nama);
        this.health = (int)(healthBase * health);
        this.damage = (int)(damageBase * damage);
    }
    
    public void stats() {
        System.out.println("Nama hero\t: " + getNama());
        System.out.println("Nyawa\t\t: " + this.health);
        System.out.println("Daya Serang\t: " + this.damage + "\n");
    }

    public void menyerang() {
        System.out.println("Memberikan damage sebesar : " + this.damage);
        specialAction();
        animasi.fight();
        System.out.println();
    }

    public Animation animasi() {
        return this.animasi;
    }
    
    @Override
    public void animation(Animation animasi) {
        this.animasi = animasi;
    }

    @Override
    public void specialAction() {
        double random = Math.random();
        //System.out.println(random);
        if(random < 0.2) {
            System.out.println("Mendapatkan ekstra damage sebesar : " + (this.damage * 0.25));
        }
    }
}
