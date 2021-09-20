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
        assertEquals(120.0f, darkelf.powerCalculateMagic(),0.2f);

}