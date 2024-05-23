package trabajof;

//CLASE ARMA
public abstract class Arma {

  private int alcance;
    private int calibre;
    private int municiones;
    private String marca;
    private String estado;
    private boolean Sello;
    private String justificacion;
    private int  NiveldeArma;
    private boolean automatica;
    
    
    
    public Arma(Policia policia, int municiones, int alcance, String marca, int calibre, String estado) {
        this.alcance = alcance;
        this.calibre = calibre;
        this.municiones = municiones;
        this.marca = marca;
        this.estado = estado;
       
       
        
        
        
        
        
        
    }
    
     public boolean tieneSello() {
        return Sello;
    }

    public void setSello(boolean tieneSello) {
        this.Sello = tieneSello;
    }
    
      public boolean esAutomatica() {
        return automatica;}

    public void setAutomatica(boolean automatica) {
        this.automatica = automatica;
    }
    public String justificacionUso() {
        return  justificacion;
    }

    public void setjustificacionUso(String  justificacionUso) {
        this.justificacion =  justificacionUso;}
    
    
      public int getNivel() {
        return  NiveldeArma;
    }

    public void setNivel(int nivel) {
        this. NiveldeArma = nivel;
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


