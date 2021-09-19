import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DarkElfTest {
    @Test
    void deveRetornaAumentoDePoderEAumnetoDePeso(){
        IPower ipower = new DragonBane();
        DarkElf darkelf = new DarkElf(100.0f,
                100.0f,
                100.0f,
                100.0f,
                100.0f);
        darkelf.setIpower(ipower);
        darkelf.setCordOfForestElves(10);
        assertEquals(120.0f, darkelf.powerCalculate(),0.2f);
    }
}