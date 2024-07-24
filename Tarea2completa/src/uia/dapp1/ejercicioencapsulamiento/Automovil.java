package uia.dapp1.ejercicioencapsulamiento;

public class Automovil {

    private String marca;
    private String modelo;
    private int anio;
    private int cilindros;
    private String color;
    private boolean turbo;
    private String transmision;
    private double enganche;
    private double costototal;
    private static double descuento;  // para ejercicio static

    public Automovil(){}

    public Automovil(double enganche, double costototal) {
        this.enganche = enganche;
        this.costototal = costototal;
    }

    public Automovil(String marca,
                     String modelo,
                     int anio,
                     int cilindros,
                     String color,
                     boolean turbo,
                     String transmision,
                     double enganche,
                     double costototal) {
        this.marca = marca;
        this.modelo = modelo;
        this.anio = anio;
        this.cilindros = cilindros;
        this.color = color;
        this.turbo = turbo;
        this.transmision = transmision;
        this.enganche = enganche;
        this.costototal = costototal;
        Automovil.descuento = 16;
    }


    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {

        return modelo;
    }

    public void setModelo(String modelo) {

        this.modelo = modelo;
    }

    public int getAnio() {

        return anio;
    }

    public void setAnio(int anio) {

        this.anio = anio;
    }

    public int getCilindros() {

        return cilindros;
    }

    public void setCilindros(int cilindros) {

        this.cilindros = cilindros;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isTurbo() {
        return turbo;
    }

    public void setTurbo(boolean turbo) {
        this.turbo = turbo;
    }

    public String getTransmision() {
        return transmision;
    }

    public void setTransmision(String transmision) {
        this.transmision = transmision;
    }

    public double getEnganche() {
        return enganche;
    }

    public void setEnganche(double enganche) {
        this.enganche = enganche;
    }

    public double getCostototal() {
        return costototal;
    }

    public void setCostototal(double costototal) {
        this.costototal = costototal;
    }

    public double precioDescuento() {

        return this.costototal - ((this.costototal * Automovil.descuento )/100);
    }



    @Override
    public String toString() {
        return "Automovil{" +
                "marca='" + marca + '\'' +
                ", modelo='" + modelo + '\'' +
                ", anio=" + anio +
                ", cilindros=" + cilindros +
                ", color='" + color + '\'' +
                ", turbo=" + turbo +
                ", transmision='" + transmision + '\'' +
                ", enganche=" + enganche +
                ", costototal=" + costototal +
                '}';
    }



}
