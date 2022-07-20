public class Main {
    public static void main(String[] args) {
        int resultado = suma(1,7,2);
        System.out.println(resultado);
        coche miCoche = new coche();
        miCoche.aumentarPuertas();
        System.out.println(miCoche.numPuertas);
    }
    public static int suma(int a, int b, int c){
        return a+b+c ;

    }
}
class coche {
    int numPuertas= 4;
    public void aumentarPuertas(){
        this.numPuertas++;
    }
}