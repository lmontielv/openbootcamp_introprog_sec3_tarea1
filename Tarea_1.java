

public class Tarea_1 {
    public static void main(String[] args) {
        int resultado = 0;
        resultado = suma(10, 20, 30);
        System.out.println(resultado);

        Coche miCoche = new Coche();
        miCoche.incPuertas();
    }

    public static int suma(int a, int b, int c) {
        return a + b + c;
    }

}