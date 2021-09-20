import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AltmerTest {
    @Test
    void ClasseAltmerComSkillDeMago(){
        IPower ipower = new Mage();
        Altmer altmer = new Altmer(100,
                100,
                100);
        altmer.setIpower(ipower);
        altmer.setSpecialHabitabilityFortifyMagicka(75);
        assertEquals(295, altmer.powerCalculateMagic(),120);
        assertEquals(140, altmer.powerCalculateHealth(),40);
        assertEquals(110, altmer.powerCalculateStamina(),10);

    }
    @Test
    void ClasseAltmerComSkillDeGuerreiro(){
        IPower ipower = new Warrior();
        Altmer altmer = new Altmer(100,
                100,
                100);
        altmer.setIpower(ipower);
        altmer.setSpecialHabitabilityFortifyMagicka(75);
        assertEquals(205, altmer.powerCalculateMagic(),30);
        assertEquals(190, altmer.powerCalculateHealth(),90);
        assertEquals(220, altmer.powerCalculateStamina(),120);

    }
    @Test
    void ClasseAltmerComSkillDeArqueiro(){
        IPower ipower = new Archer();
        Altmer altmer = new Altmer(100,
                100,
                100);
        altmer.setIpower(ipower);
        altmer.setSpecialHabitabilityFortifyMagicka(75);
        assertEquals(215, altmer.powerCalculateMagic(),40);
        assertEquals(250, altmer.powerCalculateHealth(),150);
        assertEquals(160, altmer.powerCalculateStamina(),60);

    }

}