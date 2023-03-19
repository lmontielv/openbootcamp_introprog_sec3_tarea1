//Clase Coche que contiene el método incrementar puertas
public class Coche {
    public int numPuertas = 4;

    /*Método incrementar puertas invocado desde el main 
    a través de la instancia miCoche*/
    public void incPuertas() {

        this.numPuertas++;
        System.out.println(numPuertas);   
    }
}