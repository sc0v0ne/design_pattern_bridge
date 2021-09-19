public class DarkElf extends Personagem{
    private int cordOfForestElves;

    public DarkElf(float health, float stamina, float magic, float weightPersonagem, float damagePersonagem) {
        super(health, stamina, magic, weightPersonagem, damagePersonagem);
    }


    public void setCordOfForestElves(int cordOfForestElves) {
        this.cordOfForestElves = cordOfForestElves;
    }
    public  float powerCalculate(){
        return this.damagePersonagem + this.cordOfForestElves + (1 + this.ipower.increasePower());
    }
    public  float drecreaseCalculate(){
        return this.stamina;
    }
    public  float weightCalculate(){
        return this.weightPersonagem;
    }
}
