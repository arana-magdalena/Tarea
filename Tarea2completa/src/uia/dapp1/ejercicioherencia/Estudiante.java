package uia.dapp1.ejercicioherencia;

public class Estudiante extends Persona{
    private int grado;
    private char grupo;

    public Estudiante(String nombre, String domicilio, String horario, int grado, char grupo) {
        super(nombre, domicilio, horario);
        this.grado = grado;
        this.grupo = grupo;
    }

    public int getGrado() {
        return grado;
    }

    public void setGrado(int grado) {
        this.grado = grado;
    }

    public char getGrupo() {
        return grupo;
    }

    public void setGrupo(char grupo) {
        this.grupo = grupo;
    }

    @Override
    public String toString() {
        return super.toString() + "Estudiante{" +
                "grado=" + grado +
                ", grupo=" + grupo +
                '}';
    }

    public void estudiar(){
        System.out.println("METODO ESTUDIAR DE LA CLASE ESTUDIAR");

    }
}
