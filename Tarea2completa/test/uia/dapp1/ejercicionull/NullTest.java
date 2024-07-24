package uia.dapp1.ejercicionull;

import org.junit.jupiter.api.*;
import uia.dapp1.ejercicioencapsulamiento.Encapsulamiento;

import java.io.IOException;

import static org.junit.jupiter.api.Assertions.*;

class NullTest {
    private static Null n1;

    @BeforeAll
    static void setUp(){
        System.out.println("@BeforeAll, executed");
    }

    @BeforeEach
    void setupThis(){
        System.out.println("@BeforeEach, INICIA LA PRUEBA");
    }
    @Test
    @DisplayName("verifica nullpointerexception")

    public void dividirEntreCero()  {
        System.out.println("========= TEST ONE EXECUTED =============");
        Null n1 = new Null();
        double numerador = 1;
        double denominador = 0;
        n1.dividirNatalidadMortalidad(numerador, denominador);

    }

    @AfterEach
    void testend(){
        System.out.println("@AfterEach, FINALIZA LA PRUEBA");
    }
}

