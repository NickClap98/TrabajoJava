package trabajof;


class ArmaLarga extends Arma {

 
 
    

    public ArmaLarga(Policia policia, int municiones, int alcance, String marca, int calibre, String estado, boolean tieneSello, String  justificacionUso, int nivel) {
        super(policia, municiones, alcance, marca, calibre, estado);
        this.setSello(tieneSello); 
        this.setjustificacionUso(justificacionUso);
        this.setNivel(nivel);
    }
//Comparacion de armas

    public boolean comparar(ArmaLarga otraArma, boolean comp) {
       if( this.getNivel() < otraArma.getNivel()){
          System.out.println("La Arma: "+getMarca()+" es de nivel "+getNivel()+" Tiene menos nivel que "+otraArma.getMarca()+"\nQue su nivel es: "+ otraArma.getNivel());
       
       } else{System.out.println("La Arma: "+getMarca()+" es de nivel "+getNivel()+" Tiene mas nivel que "+otraArma.getMarca()+"\nQue su nivel es: "+ otraArma.getNivel());}
        return comp;
    }
    //MOSTRAR INFO DE ARMA LARGA
/*
    public boolean tieneSello() {
        return tieneSello;
    }

    public void setSello(boolean tieneSello) {
        this.tieneSello = tieneSello;
    }

    

  

  */

 
    public void MostrarInfo(String dato) {
        dato = ("Municiones: " + getMuniciones()+ "\n Alcance: " + getAlcance() + " metros" + "\n Marca: " + getMarca() + "\n Calibre: " + getCalibre() + "\n Estado: " + getEstado() + "\n Tiene Sello: " + tieneSello() + "\n Justificacion de uso: " +
                this.justificacionUso() + "\n"
                + "Nivel: " + getNivel());
        System.out.println(dato);

    }

}
