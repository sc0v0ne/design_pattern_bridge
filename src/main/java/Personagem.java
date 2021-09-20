public abstract class Personagem {
    protected IPower ipower;
    protected int health;
    protected int stamina;
    protected int magic;


    public Personagem(int health, int stamina, int magic) {
        this.health = health;
        this.stamina = stamina;
        this.magic = magic;

    }

    public void setIpower(IPower ipower) {
        this.ipower = ipower;
    }



    public abstract int powerCalculateMagic();
    public abstract int powerCalculateHealth();
    public abstract int powerCalculateStamina();

    public void setHealth(int health) {
        this.health = health;
    }

    public void setStamina(int stamina) {
        this.stamina = stamina;
    }

    public void setMagic(int magic) {
        this.magic = magic;
    }

}
