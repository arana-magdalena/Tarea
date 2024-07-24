package uia.dapp1.ejercicioencapsulamiento;

import org.junit.jupiter.api.*;

import java.io.IOException;

import static org.junit.jupiter.api.Assertions.*;

class EncapsulamientoTest {
    private static Encapsulamiento encapsulamiento;

    @BeforeAll
    static void setUp(){
        System.out.println("@BeforeAll, executed");
    }

    @BeforeEach
    void setupThis(){
        System.out.println("@BeforeEach, INICIA LA PRUEBA");
    }
    @Test
    @DisplayName("verifica si se realiza el producto")

    void deseacomprarloProducto() throws IOException {
        System.out.println("========= TEST ONE EXECUTED =============");
        double plazo = 1;
        double costoTotal = 38000;
        Encapsulamiento objeto = new Encapsulamiento ();
        double dato = 0;
        objeto.deseacomprarlo(costoTotal, plazo);

        assertEquals(dato,costoTotal/plazo*12);

    }
    @AfterEach
    void testend(){
        System.out.println("@AfterEach, FINALIZA LA PRUEBA");
    }
}