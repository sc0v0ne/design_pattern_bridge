public abstract class Personagem {
    protected IPower ipower;
    protected float health;
    protected float stamina;
    protected float magic;
    protected float weightPersonagem;
    protected float damagePersonagem;

    public Personagem(float health, float stamina, float magic, float weightPersonagem, float damagePersonagem) {
        this.health = health;
        this.stamina = stamina;
        this.magic = magic;
        this.weightPersonagem = weightPersonagem;
        this.damagePersonagem = damagePersonagem;
    }

    public void setIpower(IPower ipower) {
        this.ipower = ipower;
    }



    public abstract float powerCalculate();
    public abstract float drecreaseCalculate();
    public abstract float weightCalculate();

    public void setHealth(float health) {
        this.health = health;
    }

    public void setStamina(float stamina) {
        this.stamina = stamina;
    }

    public void setMagic(float magic) {
        this.magic = magic;
    }

    public void setWeightPersonagem(float weightPersonagem) {
        this.weightPersonagem = weightPersonagem;
    }

    public void setDamagePersonagem(float damagePersonagem) {
        this.damagePersonagem = damagePersonagem;
    }
}
