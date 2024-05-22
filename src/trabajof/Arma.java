package trabajof;

//CLASE ARMA
public abstract class Arma {

  private int alcance;
    private int calibre;
    private int municiones;
    private String marca;
    private String estado;

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



public int getAlcance() {
        return alcance;
    }

    public void setAlcance(int alcance) {
        this.alcance = alcance;
    }

    public int getCalibre() {
        return calibre;
    }

    public void setCalibre(int calibre) {
        this.calibre = calibre;
    }

    public int getMuniciones() {
        return municiones;
    }

    public void setMuniciones(int municiones) {
        this.municiones = municiones;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }



 private boolean automatica;

    public boolean esAutomatica() {
        return automatica;
    }

    public void setAutomatica(boolean automatica) {
        this.automatica = automatica;
    }

    void MostrarInfo(String string) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
//CLASE ARMACORTA QUE A SU VEZ ES UNA EXTENSION DE ARMA

class ArmaCorta extends Arma {

  

    public ArmaCorta(Policia policia, int alcance, int calibre, int municiones, String marca, String estado,  boolean automatica) {
        super(policia,alcance,municiones, marca, calibre, estado);
        
        
    }

    /// COMPARACION DE ALCANCE MAYOR QUE 200m 
    public boolean disparoALargaDistancia(boolean Dist_disp) {

        if (this.getAlcance()> 200) {
            System.out.println(" Si dispara a larga distancia");
        } else {
            System.out.println(" No dispara a larga distancia");

        }
        return Dist_disp;

    }

    

    //MOSTRAR INFO DE ARMA CORTA   
    public void MostrarInfo(String dato) {
        dato = ("Municiones: " + this.getMuniciones() + "\n Alcance: " + this.getAlcance() + " metros" + "\n Marca: " + this.getMarca() + "\n Calibre: " + this.getCalibre() + "\n Estado: " + this.getEstado() + "\n"
                + "Es Automatica?: " + esAutomatica());
        System.out.println(dato);

    }
}
//CLASE ARMA LARGA QUE A SU VEZ ES UNA EXTENSION DE ARMA

class ArmaLarga extends Arma {

    boolean tieneSello;
    String  justificacionUso;
    int  NiveldeArma;

    public ArmaLarga(Policia policia, int municiones, int alcance, String marca, int calibre, String estado, boolean tieneSello, String  justificacionUso, int nivel) {
        super(policia, municiones, alcance, marca, calibre, estado);
        this.tieneSello = tieneSello;
        this. justificacionUso =  justificacionUso;
        this. NiveldeArma = nivel;
    }
//Comparacion de armas

    public boolean comparar(ArmaLarga otraArma, boolean comp) {
       if( NiveldeArma < otraArma. NiveldeArma){
          System.out.println("La Arma: "+getMarca()+" es de nivel "+getNivel()+" Tiene menos nivel que "+otraArma.getMarca()+"\nQue su nivel es: "+ otraArma.getNivel());
       
       } else{System.out.println("La Arma: "+getMarca()+" es de nivel "+getNivel()+" Tiene mas nivel que "+otraArma.getMarca()+"\nQue su nivel es: "+ otraArma.getNivel());}
        return comp;
    }
    //MOSTRAR INFO DE ARMA LARGA

    public boolean tieneSello() {
        return tieneSello;
    }

    public void setSello(boolean tieneSello) {
        this.tieneSello = tieneSello;
    }

    public String justificacionUso() {
        return  justificacionUso;
    }

    public void setjustificacionUso(String  justificacionUso) {
        this. justificacionUso =  justificacionUso;
    }

    public int getNivel() {
        return  NiveldeArma;
    }

    public void setNivel(int nivel) {
        this. NiveldeArma = nivel;
    }

  

    public void MostrarInfo(String dato) {
        dato = ("Municiones: " + getMuniciones()+ "\n Alcance: " + getAlcance() + " metros" + "\n Marca: " + getMarca() + "\n Calibre: " + getCalibre() + "\n Estado: " + getEstado() + "\n Tiene Sello: " + tieneSello() + "\n Justificacion de uso: " + justificacionUso + "\n"
                + "Nivel: " + getNivel());
        System.out.println(dato);

    }

}
