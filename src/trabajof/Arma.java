package trabajof;

//CLASE ARMA
public class Arma {

    int alcance;
    int calibre;
    int municiones;
    String marca;
    String estado;

    public Arma(Policia policia, int municiones, int alcance, String marca, int calibre, String estado) {
        this.alcance = alcance;
        this.calibre = calibre;
        this.municiones = municiones;
        this.marca = marca;
        this.estado = estado;
    }
//COMPARACION EN CALIBRE Y ESTADO IGNORANDO LAS MINUSCULAS Y MAYUSCULAS

    public boolean enCondiciones(boolean condiciones) {
        if (calibre >= 9 && estado.equalsIgnoreCase("EN USO")) {
            System.out.println("Si esta en condiciones ");
        } else {
            System.out.println("No esta en condiciones");
        }
        return condiciones;
    }
}
//CLASE ARMACORTA QUE A SU VEZ ES UNA EXTENSION DE ARMA

class ArmaCorta extends Arma {

    boolean automatica;

    public ArmaCorta(Policia policia, int alcance, int calibre, int municiones, String marca, String estado, boolean automatica) {
        super(policia,alcance,municiones, marca, calibre, estado);
        this.automatica = automatica;
    }

    /// COMPARACION DE ALCANCE MAYOR QUE 200m 
    public boolean disparoALargaDistancia(boolean Dist_disp) {

        if (alcance > 200) {
            System.out.println(" Si");
        } else {
            System.out.println(" No");

        }
        return Dist_disp;

    }

    //MOSTRAR INFO DE ARMA CORTA   
    public void MostrarInfo(String dato) {
        dato = ("Municiones: " + this.municiones + "\n Alcance: " + this.alcance + " metros" + "\n Marca: " + this.marca + "\n Calibre: " + this.calibre + "\n Estado: " + this.estado + "\n"
                + "Es Automatica?: " + this.automatica);
        System.out.println(dato);

    }
}
//CLASE ARMA LARGA QUE A SU VEZ ES UNA EXTENSION DE ARMA

class ArmaLarga extends Arma {

    boolean renar;
    String descripcion;
    int nivel;

    public ArmaLarga(Policia policia, int municiones, int alcance, String marca, int calibre, String estado, boolean renar, String descripcion, int nivel) {
        super(policia, municiones, alcance, marca, calibre, estado);
        this.renar = renar;
        this.descripcion = descripcion;
        this.nivel = nivel;
    }
//Comparacion de armas

    public boolean comparar(ArmaLarga otraArma, boolean comp) {
       if(nivel < otraArma.nivel){
          System.out.println("La Arma: "+this.marca+" es de nivel "+nivel+" Tiene menos nivel que "+otraArma.marca+"\nQue su nivel es: "+ otraArma.nivel);
       
       } else{System.out.println("La Arma: "+this.marca+" es de nivel "+nivel+" Tiene mas nivel que "+otraArma.marca+"\nQue su nivel es: "+ otraArma.nivel);}
        return comp;
    }
    //MOSTRAR INFO DE ARMA LARGA

    public void MostrarInfo(String dato) {
        dato = ("Municiones: " + this.municiones + "\n Alcance: " + this.alcance + " metros" + "\n Marca: " + this.marca + "\n Calibre: " + this.calibre + "\n Estado: " + this.estado + "\n RENAR: " + this.renar + "\n Descripcion: " + this.descripcion + "\n"
                + "Nivel: " + this.nivel);
        System.out.println(dato);

    }

}
