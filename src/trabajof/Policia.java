package trabajof;

public class Policia {
    
    String nombre;
    String apellido;
    //Legajo = NUMERO DE PLACA
    int legajo;
    
public Policia(String nombre, String apellido, int legajo){
this.nombre = nombre;
        this.apellido = apellido;
        this.legajo = legajo;}
//METODO PARA MOSTRAR INFO ASI NO ABUSAMOS DEL SYSTEM.OUT.PRINTLN
public void MostrarInfo(String Dato){
Dato = "Datos del efectivo: "+this.nombre + " " + this.apellido + " \n Numero de placa: "+this.legajo;
 System.out.println(Dato);
 
}
}///



