package uia.dapp1.ejercicioencapsulamiento;
import java.io.*;

public class Encapsulamiento {
    public static void main(String[] args) throws IOException {

        int opcion = 0;
        double plazo = 0;
        double costototal = 0;

        do {
            System.out.println("VENTA DE AUTOS");
            opcion = menu();


            switch (opcion) {
                case 1:
                    carro1default();
                    deseacomprarlo(costototal, plazo);

                    break;
                case 2:
                    carro2default();
                    deseacomprarlo(costototal, plazo);

                    break;
                case 3:
                    carro3default();
                    deseacomprarlo(costototal, plazo);

                    break;
                case 4:
                    break;
                default:
                    System.out.println("OPCION INVALIDA");
                    break;
            }


        } while (opcion < 4);
    }



    public static int menu() throws IOException {
        BufferedReader buffer = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("ELIGE RANGO DE PRECIO");
        System.out.println("1.- ENTRE 35000 Y 50000");
        System.out.println("2.- ENTRE 50000 Y 100000");
        System.out.println("3.- ENTRE 100000 Y 500000");
        System.out.println("4.- SALIR");
        int opcion = Integer.parseInt(buffer.readLine());

        return opcion;
    }

    public static void carro1default() {
        Automovil auto1 = new Automovil();

        System.out.println("**********************");
        System.out.println("UNICA OFERTA");
        auto1.setMarca("VOCHO");
        System.out.println(auto1.getMarca());
        auto1.setModelo("95");
        System.out.println(auto1.getModelo());
        auto1.setAnio(95);
        System.out.println(auto1.getAnio());
        auto1.setCilindros(4);
        System.out.println(auto1.getCilindros());
        auto1.setColor("AZUL");
        System.out.println(auto1.getColor());
        auto1.setTurbo(false);
        System.out.println(auto1.isTurbo());
        auto1.setTransmision("STANDAR");
        System.out.println(auto1.getTransmision());
        auto1.setCostototal(38000);
        System.out.println(auto1.getCostototal());
        System.out.println("**********************");

    }

    public static void carro2default() {
        Automovil auto1 = new Automovil();
        System.out.println("**********************");
        System.out.println("UNICA OFERTA");
        auto1.setMarca("DODGE ATTITUDE");
        System.out.println(auto1.getMarca());
        auto1.setModelo("SXT");
        System.out.println(auto1.getModelo());
        auto1.setAnio(2015);
        System.out.println(auto1.getAnio());
        auto1.setCilindros(3);
        System.out.println(auto1.getCilindros());
        auto1.setColor("PLATA");
        System.out.println(auto1.getColor());
        auto1.setTurbo(false);
        System.out.println(auto1.isTurbo());
        auto1.setTransmision("CVT");
        System.out.println(auto1.getTransmision());
        auto1.setCostototal(100000);
        System.out.println(auto1.getCostototal());
        System.out.println("**********************");
    }

    public static void carro3default() {
        Automovil auto1 = new Automovil();

        System.out.println("**********************");
        System.out.println("UNICA OFERTA");
        auto1.setMarca("TOYOTA");
        System.out.println(auto1.getMarca());
        auto1.setModelo("COROLLA HIBRID");
        System.out.println(auto1.getModelo());
        auto1.setAnio(2022);
        System.out.println(auto1.getAnio());
        auto1.setCilindros(2);
        System.out.println(auto1.getCilindros());
        auto1.setColor("NEGRO");
        System.out.println(auto1.getColor());
        auto1.setTurbo(true);
        System.out.println(auto1.isTurbo());
        auto1.setTransmision("CVT");
        System.out.println(auto1.getTransmision());
        auto1.setCostototal(477000);
        System.out.println(auto1.getCostototal());
        System.out.println("**********************");
    }

    public static void  deseacomprarlo(double costototal, double plazo) throws IOException {
        BufferedReader bufer = new BufferedReader(new InputStreamReader(System.in));
        Automovil auto2 = new Automovil(0, 38000);

        System.out.println("DESEA COMPRARLO 1 PARA SI 2 PARA NO");
        int n = Integer.parseInt(bufer.readLine());
        if (n == 1) {
            System.out.println("FELICIDADES");
            System.out.println("INGRESA PLAZO EN AÑOS");
            plazo = Integer.parseInt(bufer.readLine());
            auto2.setCostototal(auto2.getCostototal());
            double dato = auto2.getCostototal() / (plazo * 12);
            System.out.println("EL ENGANCHE ES: ");
            auto2.setEnganche(dato);
            System.out.println(auto2.getEnganche());
        } else {

        }

    }


}




