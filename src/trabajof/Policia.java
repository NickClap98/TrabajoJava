package trabajof;

import java.util.ArrayList;

public class Policia {
    
    private String nombre;
    private String apellido;
    private int legajo;
    private ArrayList<Arma> armasAsociadas;
    
    public Policia(String nombre, String apellido, int legajo) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.legajo = legajo;
        this.armasAsociadas = new ArrayList<>();
    }
    
    public void agregarArma(Arma arma) {
        armasAsociadas.add(arma);
    }
    
    public void eliminarArma(Arma arma) {
        armasAsociadas.remove(arma);
    }
    
    public void mostrarArmas() {
        System.out.println("Armas asociadas al policia: " + nombre + " " + apellido );
        for (Arma arma : armasAsociadas) {
            System.out.println(arma.getMarca()+" " );
        }
    }
    
          
          
    
    
    
    public void MostrarInfo(String dato){
        dato = "Datos del efectivo: " + nombre + " " + apellido + "\nNumero de placa: " + legajo;
        System.out.println(dato);
    }
}