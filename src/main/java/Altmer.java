public class Altmer extends Personagem{
    private int specialHabitabilityFortifyMagicka;

    public Altmer(int health, int stamina, int magic) {
        super(health, stamina, magic);
    }
    public void setSpecialHabitabilityFortifyMagicka(int specialHabitabilityFortifyMagicka) {
        this.specialHabitabilityFortifyMagicka = specialHabitabilityFortifyMagicka;
    }
    public int powerCalculateMagic(){
        return this.magic + this.specialHabitabilityFortifyMagicka + (1 + this.ipower.increasePowerMagic());
    }
    public  int powerCalculateHealth(){
        return this.health +  (1 + this.ipower.increasePowerHealth());
    }
    public int powerCalculateStamina(){
        return this.stamina + (1 + this.ipower.increasePowerStamina());
    }
}
