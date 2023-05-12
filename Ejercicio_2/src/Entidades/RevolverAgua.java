/*
 * Clase Revolver de agua: esta clase posee los siguientes atributos: posici�n actual (posici�n
    del tambor que se dispara, puede que est� el agua o no) y posici�n agua (la posici�n del
    tambor donde se encuentra el agua). Estas dos posiciones, se generar�n aleatoriamente.
 */
package Entidades;

/**
 *
 * @author CamiloH
 */
public class RevolverAgua {

    private int posicionActual;
    private int posicionAgua;

    //Metodo para llenar las posiciones aletoriamente
    public void llenarRevolver() {

        posicionActual = (int) (Math.random() * 6) + 1;
        posicionAgua = (int) (Math.random() * 6) + 1;

    }

    public boolean mojar() {
        if (posicionActual == posicionAgua) {
            return true;
        } else {
            return false;
        }

    }
    
    public void siguienteChorro(){
        posicionActual += 1; 
    
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("RevolverAgua{");
        sb.append("\nposicionActual=").append(posicionActual);
        sb.append(",\nposicionAgua=").append(posicionAgua);
        sb.append('}');
        return sb.toString();
    }
    
    
    

}
