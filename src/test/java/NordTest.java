import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class NordTest {

    @Test
    void ClasseNordComSkillDeMago(){
        IPower ipower = new Mage();
        Nord nord = new Nord(100,
                100,
                100);
        nord.setIpower(ipower);
        nord.setSpecialHabitabilityResistFrost(50);
        assertEquals(220, nord.powerCalculateMagic(),120);
        assertEquals(190, nord.powerCalculateHealth(),40);
        assertEquals(110, nord.powerCalculateStamina(),10);

    }
    @Test
    void ClasseNordComSkillDeGuerreiro(){
        IPower ipower = new Warrior();
        Nord nord = new Nord(100,
                100,
                100);
        nord.setIpower(ipower);
        nord.setSpecialHabitabilityResistFrost(50);
        assertEquals(130, nord.powerCalculateMagic(),30);
        assertEquals(240, nord.powerCalculateHealth(),90);
        assertEquals(220, nord.powerCalculateStamina(),120);

    }
    @Test
    void ClasseNordComSkillDeArqueiro(){
        IPower ipower = new Archer();
        Nord nord = new Nord(100,
                100,
                100);
        nord.setIpower(ipower);
        nord.setSpecialHabitabilityResistFrost(50);
        assertEquals(140, nord.powerCalculateMagic(),40);
        assertEquals(300, nord.powerCalculateHealth(),150);
        assertEquals(160, nord.powerCalculateStamina(),60);

    }
}