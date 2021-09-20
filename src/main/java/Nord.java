public class Nord extends Personagem{
    private int specialHabitabilityResistFrost;

    public Nord(int health, int stamina, int magic) {
        super(health, stamina, magic);
    }
    public void setSpecialHabitabilityResistFrost(int specialHabitabilityResistFrost) {
        this.specialHabitabilityResistFrost = specialHabitabilityResistFrost;
    }
    public int powerCalculateMagic(){
        return this.magic + (1 + this.ipower.increasePowerMagic());
    }
    public  int powerCalculateHealth(){
        return this.health + this.specialHabitabilityResistFrost + (1 + this.ipower.increasePowerHealth());
    }
    public int powerCalculateStamina(){
        return this.stamina + (1 + this.ipower.increasePowerStamina());
    }
}
