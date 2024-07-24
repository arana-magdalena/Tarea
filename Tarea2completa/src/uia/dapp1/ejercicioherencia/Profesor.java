package uia.dapp1.ejercicioherencia;

public class Profesor extends Empleado {
    private String carrera;


    public Profesor(String nombre, String domicilio, String horario, String jefe, String carrera) {
        super(nombre, domicilio, horario, jefe);
        this.carrera = carrera;
    }

    public String getCarrera() {
        return carrera;
    }

    public void setCarrera(String carrera) {
        this.carrera = carrera;
    }

    @Override
    public String toString() {
        return super.toString() + "Profesor{" +
                "carrera='" + carrera + '\'' +
                '}';
    }
    public void ensenar(){
        System.out.println("METODO ENSEÑAR DE LA CLASE PROFESOR");

    }
}
