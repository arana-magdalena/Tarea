package uia.dapp1.ejerciciostatic;

import org.junit.jupiter.api.*;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import uia.dapp1.ejercicionull.Null;

import static org.junit.jupiter.api.Assertions.*;

class StaticMainTest {


    @BeforeClass
    public static void setUpBeforeClass() throws Exception {

    }
    @AfterClass
    public static void tearDownAfterClass() throws Exception {

    }

    /**
     Con esta prueba verificamos que jUnit esta funcionando
     */
    @Test
    public void pruebaJUnit(){

        assertTrue(true);
    }
    @Test
    @DisplayName("verifica calculo precio con descuento")

    public void calculoDescuento()  {
        System.out.println("========= TEST ONE EXECUTED =============");
        StaticMain sm = new StaticMain();
        assertEquals(0.1, sm.precioDescuento());

    }

    @AfterEach
    void testend(){
        System.out.println("@AfterEach, FINALIZA LA PRUEBA");
    }



}