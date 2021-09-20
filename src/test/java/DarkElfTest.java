import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DarkElfTest {

    @Test
    void ClasseDarkElfComSkillDeMagia(){
        IPower ipower = new PowerMagic();
        DarkElf darkelf = new DarkElf(100,
                100,
                100);
        darkelf.setIpower(ipower);
        assertEquals(220, darkelf.powerCalculateMagic(),120);
        assertEquals(140, darkelf.powerCalculateHealth(),40);
        assertEquals(110, darkelf.powerCalculateStamina(),10);

    }
}
