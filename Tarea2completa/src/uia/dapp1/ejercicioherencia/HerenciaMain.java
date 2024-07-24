package uia.dapp1.ejercicioherencia;
import java.io.*;

public class HerenciaMain {
    public static void main(String[] args) throws IOException {

        Empleado empleado1 = new Empleado("Diana", "Aurora 41 Versalles, Cordova", "19:00 hrs", "Contabilidad");
      //  System.out.println("EMPLEADO =" + empleado1);
        System.out.println("EMPLEADO");
        System.out.println(empleado1);
        empleado1.asistir();
        empleado1.cobrar();

        Administrador administrador1 = new Administrador("REGINA","PASEO DE LOS LAURELES 56 DEL SUR","23:00 HRS", "AUDITORIA","AUDITORA");

        System.out.println("ADMINISTRADOR");
        System.out.println(administrador1);
        administrador1.asistir();
        administrador1.cobrar();
        administrador1.administrar();

        System.out.println("PROFESOR");
        Profesor profesor1 = new Profesor("YOLANDA","CORALES 34 JARDINES","9:00 HRS","SERVICIO SOCIAL","SISTEMAS COMPUTACIONALES");
        System.out.println(profesor1);
        profesor1.asistir();
        profesor1.cobrar();
        profesor1.ensenar();

        System.out.println("ESTUDIANTE");
        Estudiante estudiante1 = new Estudiante("ROSA","AV. MEXICO 23 FLORIDA","20:00 HRS",1,'A');
        System.out.println(estudiante1);
        estudiante1.asistir();
        estudiante1.estudiar();


    }

}

class Persona{
    private String nombre;
    private String domicilio;
    private String horario;


    public Persona(String nombre, String domicilio, String horario) {
        this.nombre = nombre;
        this.domicilio = domicilio;
        this.horario = horario;

    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDomicilio() {
        return domicilio;
    }

    public void setDomicilio(String domicilio) {
        this.domicilio = domicilio;
    }

    public String getHorario() {
        return horario;
    }

    public void setHorario(String horario) {
        this.horario = horario;
    }



    @Override
    public String toString() {
        return "Persona{" +
                "nombre='" + nombre + '\'' +
                ", domicilio='" + domicilio + '\'' +
                ", horario='" + horario + '\'' +
                '}';
    }


    public void asistir(){
        System.out.println("METODO ASISTIR DE LA CLASE PERSONA");
    }

    }




