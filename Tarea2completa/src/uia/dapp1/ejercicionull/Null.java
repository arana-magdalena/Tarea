package uia.dapp1.ejercicionull;
import java.io.*;

public class Null {
    public static void main(String[] args) throws IOException {
        BufferedReader bufer = new BufferedReader(new InputStreamReader(System.in));

        int opcion;
        double c = 0;
        double numerador = 0;
        double denominador = 0;
        do{
            System.out.println("**  USO DE null  **  ");
            System.out.println("ELIGE UNA OPCION ");
            System.out.println(" 1.- EXPLICACION DE NULL ");
            System.out.println(" 2.- null REFERENCIAS COMPARTIDAS POR VARIOS OBJETOS");
            System.out.println(" 3.- COCIENTE NATALIDAD MORTALIDAD");
            System.out.println(" 4.- SALIR");
            
            opcion = Integer.parseInt(bufer.readLine());

            switch (opcion) {
                case 1: {
                    System.out.println("EXPLICACION 1");
                    System.out.println("Se declara un objeto llamado p1 de tipo Pais ");
                    System.out.println("Pais p1");
                    System.out.println("al no estar instanciado vale null - su referencia es null");
                    System.out.println("es necesario asegurarse que los objetos existen para evitar referencias null");
                    System.out.println("Es necesario instanciar el objeto es decir usar operador new");

                    //Pais p1;  //objeto declarado al no estar instanciado aqui n1 vale null
                    System.out.println("VALIDAMOS QUE EL OBJETO NO APUNTE A NULL");
                    Pais p1 = new Pais("MEXICO", "AMERICANO", 128.9000000, 17.01, 6.15);

                    if (p1 == null) {
                        System.out.println("OBJETO ES UNA REFERENCIA null");
                    }
                    if (p1 != null) {
                        System.out.println("OBJETO ESTA INSTANCIADO");
                    }
                    System.out.println("NOMBRE:   " + p1.nombre);
                    System.out.println("CONTINENTE:   " + p1.continente);
                    System.out.println("POBLACION:   " + p1.poblacion);
                    System.out.println("TASA NATALIDAD PORCIENTO:   " + p1.tasabrutaNatalidad);
                    System.out.println("TASA MORTALIDAD PORCIENTO:   " + p1.tasabrutaNatalidad);
                }
                break;
                case 2:
                    System.out.println("EXPLICACION 2");
                    System.out.println("REFERENCIAS COMPARTIDAS POR VARIOS OBJETOS");

                    Pais p2 = new Pais("JAPON", "ASIA", 125.8000000, 6.8, 11.1);
                    System.out.println("POBLACION  2" + p2.mostrarDatos());
                    System.out.println("SE ASIGNA LA MISMA REFERENCIA A p3 , p2 SIGUE APUNTANDO AL OBJETO PAIS");
                    Pais p3 = p2;
                    System.out.println("POBLACION  3" + p3.mostrarDatos());
                    System.out.println("AHORA p2 APUNTA A nULL");
                    p2 = null;
                    p3 = null;
                    System.out.println("OBJETOS QUE NO TIENEN APUNTADOS NADA A ELLOS SE ELIMINARAN CON EL SIGUIENTE METODO GARBAGE COLLECTOR");
                    System.gc();

                    if (p2 != null) {
                        System.out.println("POBLACION 2" + p2.mostrarDatos());
                    }
                    break;
                case 3:
                    c = dividirNatalidadMortalidad(numerador,denominador);
                    System.out.println("COCIENTE: " + c);

                    break;
                case 4:
                    break;

                default:
                    System.out.println("OPCION INVALIDA");
            }
        } while (opcion < 4);

    }

    public static double dividirNatalidadMortalidad(double tasabrutaNatalidad, double tasabrutaMortalidad){
        Pais p = new Pais(6.8, 11.1);

        double cociente = p.tasabrutaNatalidad/p.tasabrutaMortalidad;
        //Double c = cociente;//= Double.parseDouble(null);
        return cociente;
    }


}

class Pais{
    String nombre;
    String continente;
    double poblacion;
    double tasabrutaNatalidad;
    double tasabrutaMortalidad;

    public Pais(Double tasabrutaNatalidad, Double tasabrutaMortalidad) {
        this.tasabrutaNatalidad = tasabrutaNatalidad;
        this.tasabrutaMortalidad = tasabrutaMortalidad;
    }

    Pais(String nombre,
         String continente,
         double poblacion,
         double tasabrutaNatalidad,
         double tasabrutaMortalidad) {
        this.nombre = nombre;
        this.continente = continente;
        this.poblacion = poblacion;
        this.tasabrutaNatalidad = tasabrutaNatalidad;
        this.tasabrutaMortalidad = tasabrutaMortalidad;
    }
    public double mostrarDatos(){
        return this.poblacion;

    }


}




