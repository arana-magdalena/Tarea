package uia.dapp1.ejercicioherencia;

import org.junit.jupiter.api.*;
import uia.dapp1.ejercicioencapsulamiento.Encapsulamiento;

import java.io.IOException;

import static org.junit.jupiter.api.Assertions.*;

class ProfesorTest {
    private static Profesor profesor = new Profesor("dddd","aaa","222","www","ss");

    @BeforeAll
    static void setUp(){
        System.out.println("@BeforeAll, executed");
    }

    @BeforeEach
    void setupThis(){
        System.out.println("@BeforeEach, INICIA LA PRUEBA");
    }
    @Test
    @DisplayName("verifica metodo ensenar")

    void probarEnsenar() {
        System.out.println("========= TEST ONE EXECUTED =============");

        profesor.ensenar();

    }
    @AfterEach
    void testend(){
        System.out.println("@AfterEach, FINALIZA LA PRUEBA");
    }
}

