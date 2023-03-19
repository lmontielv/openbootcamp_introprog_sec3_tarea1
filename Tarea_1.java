

public class Tarea_1 {
    public static void main(String[] args) {
        int resultado = 0;
        //llamada a la función suma con paso de parámetros por valor
        resultado = suma(10, 20, 30);
        System.out.println(resultado);

        //instancia miCoche para llamar el método incPuertas()
        Coche miCoche = new Coche();
        
        /*llamada al método incPuertas() 
        para usar la función con paso de parámetros por referencia */
        miCoche.incPuertas();
    }

    //Función de suma por paso de parámetros por valor
    public static int suma(int a, int b, int c) {
        return a + b + c;
    }

}