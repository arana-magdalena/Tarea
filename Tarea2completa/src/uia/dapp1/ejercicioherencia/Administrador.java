package uia.dapp1.ejercicioherencia;

public class Administrador extends Empleado {
    private String puesto;

    public Administrador(String nombre, String domicilio, String horario, String jefe, String puesto) {
        super(nombre, domicilio, horario, jefe);
        this.puesto = puesto;
    }

    public String getPuesto() {
        return puesto;
    }

    public void setPuesto(String puesto) {
        this.puesto = puesto;
    }

    @Override
    public String toString() {
        return super.toString() +  "Administrador{" +
                "puesto='" + puesto + '\'' +
                '}';
    }
    public void administrar(){
        System.out.println("METODO ADMINISTRAR DE LA CLASE ADMINISTRADOR");

    }
}
