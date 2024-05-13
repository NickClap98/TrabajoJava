package trabajof;

public class TrabajoF {

    public static void main(String[] args) {
        boolean resp = true;
        Policia policia1 = new Policia("Nicolas", "Etchevarne", 000001);
        ArmaCorta armaCorta1 = new ArmaCorta(policia1, 9, 8, 50, "Desert Eagle", "EN USO", true);
        ArmaLarga armaLarga1 = new ArmaLarga(policia1, 30, 500, "M4A1", 30, "EN USO", true, "Uso para operativos tácticos", 11);
           ArmaLarga armaLarga2 = new ArmaLarga(policia1, 12, 700, "AMW", 30, "EN USO", true, "Uso para operativos tácticos", 22);

      armaLarga1.comparar(armaLarga2, resp);
     

    }

}

/*

//COMPARAR ARMAS
   armaLarga1.comparar(armaLarga2, resp);

//MOSTRAR INFO DE POLICIA
     policia1.MostrarInfo("");
     
 //MOSTRAR INFO DE ARMA LARGA
     armaLarga1.MostrarInfo("");
     
   
     
     //MOSTRAR INFORMACION DE LO SETEADO EN ARMACORTA
     armaCorta1.MostrarInfo("");
     
          System.out.println("Dispara A Larga Distancia?: ");
   
          //SABER SU TIENE DISPARO A LARGA DISTANCIA A PARTIR DE 201Metros 
          armaCorta1.disparoALargaDistancia(resp);
    
   
   ///PARA SABER SI ESTA EN CONDICIONES DE USO TIENE QUE ESTAR "EN USO" Y SER CALIBRE MAYOR O IGUAL A 9
   armaCorta1.enCondiciones(resp);
    
*/
