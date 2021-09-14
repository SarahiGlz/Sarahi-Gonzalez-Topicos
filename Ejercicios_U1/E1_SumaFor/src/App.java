public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hola! Este es un programa sencillo en Java");

        int valor1=0; 
        int valor2=1;
        int ciclos=10;
        int suma= valor1+valor2;

        System.out.println("Valor 1: "+ valor1);
        System.out.println("Valor 2: "+ valor2);

        for(int x=1; x<=ciclos; x++)
        {
            suma=suma+valor2;
        }

        System.out.println("La suma es "+ suma);
    }
}
