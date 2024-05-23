
package trabajof;


//CLASE ARMACORTA QUE A SU VEZ ES UNA EXTENSION DE ARMA
class ArmaCorta extends Arma {

  

    public ArmaCorta(Policia policia, int alcance, int calibre, int municiones, String marca, String estado,  boolean automatica) {
        super(policia,alcance,municiones, marca, calibre, estado);
        this.setAutomatica(automatica);
        
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
                + "Es Automatica?: " + this.esAutomatica());
        System.out.println(dato);

    }
}
//CLASE ARMA LARGA QUE A SU VEZ ES UNA EXTENSION DE ARMA

