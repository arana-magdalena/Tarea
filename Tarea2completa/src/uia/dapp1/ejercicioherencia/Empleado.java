package uia.dapp1.ejercicioherencia;

public class Empleado extends Persona {
    private String jefe;

    public Empleado(String nombre, String domicilio, String horario, String jefe) {
        super(nombre, domicilio, horario);
        this.jefe = jefe;
    }


    public String getJefe() {
        return jefe;
    }

    public void setJefe(String jefe) {
        this.jefe = jefe;
    }

    @Override
    public String toString() {
        return super.toString() + "Empleado{" +
                "jefe='" + jefe + '\'' +
                '}';
    }

    public void cobrar() {
        System.out.println("METODO COBRAR DE LA CLASE EMPLEADO");
    }
}

