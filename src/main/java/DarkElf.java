public class DarkElf extends Personagem{


    public DarkElf(int health, int stamina, int magic) {
        super(health, stamina, magic);
    }

    public int powerCalculateMagic(){
        return this.magic + (1 + this.ipower.increasePowerMagic());
    }
    public  int powerCalculateHealth(){
        return this.health + (1 + this.ipower.increasePowerHealth());
    }
    public int powerCalculateStamina(){
        return this.stamina + (1 + this.ipower.increasePowerStamina());
    }
}
