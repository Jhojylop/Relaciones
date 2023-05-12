package models;

public class Revolver {
    private int posicionActual;
    private int posicionAgua;

    private final int maximoBalas = 6;

    public void llenarRevolver() {
        this.posicionActual = (int) (Math.random() * this.maximoBalas) + 1;
        this.posicionAgua = (int) (Math.random() * this.maximoBalas) + 1;
    }

    public boolean mojar() {
        return this.posicionAgua == this.posicionActual;
    }

    public void siguienteChorro() {
        if (this.posicionActual != this.maximoBalas) {
            this.posicionActual += 1;
        } else {
            this.posicionActual = 1;
        }
    }

    @Override
    public String toString() {
        return "Revolver:" +
                "La Posicion del revolver es = " + posicionActual +
                " La posicion del agua es = " + posicionAgua;
    }
}
