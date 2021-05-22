package TugasAkhir;

public class HeroAnimation implements Animation {
    private boolean isRest;

    @Override
    public void idle() {
        isRest = false;
        System.out.println("Hero sedang mendalami skill\n");
    }

    @Override
    public void rest() {
        isRest = true;
        System.out.println("Hero sedang beristirahat\n");
    }

    @Override
    public void fight() {
        if(!isRest) {
            System.out.println("Hero menyerang!!\n");
        } else {
            System.out.println("Hero sedang beristirahat, tidak bisa menyerang\n");
        }
    }
}
