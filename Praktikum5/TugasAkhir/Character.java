package TugasAkhir;

public abstract class Character {
    protected double healthBase = 1.5;
    protected double damageBase = 1.2;
    protected String nama;

    protected void setNama(String nama) {
        this.nama = nama;
    }

    protected String getNama() {
        return this.nama;
    }

    abstract void animation(Animation animasi);
    abstract void specialAction(); 
}
