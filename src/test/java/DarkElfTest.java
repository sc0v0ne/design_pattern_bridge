import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DarkElfTest {

    @Test
    void ClasseDarkElfComSkillDeMago(){
        IPower ipower = new Mage();
        DarkElf darkelf = new DarkElf(100,
                100,
                100);
        darkelf.setIpower(ipower);
        assertEquals(220, darkelf.powerCalculateMagic(),120);
        assertEquals(140, darkelf.powerCalculateHealth(),40);
        assertEquals(110, darkelf.powerCalculateStamina(),10);

    }
    @Test
    void ClasseDarkElfComSkillDeGuerreiro(){
        IPower ipower = new Warrior();
        DarkElf darkelf = new DarkElf(100,
                100,
                100);
        darkelf.setIpower(ipower);
        assertEquals(130, darkelf.powerCalculateMagic(),30);
        assertEquals(190, darkelf.powerCalculateHealth(),90);
        assertEquals(220, darkelf.powerCalculateStamina(),120);

    }
    @Test
    void ClasseDarkElfComSkillDeArqueiro(){
        IPower ipower = new Archer();
        DarkElf darkelf = new DarkElf(100,
                100,
                100);
        darkelf.setIpower(ipower);
        assertEquals(140, darkelf.powerCalculateMagic(),40);
        assertEquals(250, darkelf.powerCalculateHealth(),150);
        assertEquals(160, darkelf.powerCalculateStamina(),60);

    }
}
