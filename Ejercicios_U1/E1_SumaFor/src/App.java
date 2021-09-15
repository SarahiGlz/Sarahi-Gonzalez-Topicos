public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hola! Este es un programa sencillo en Java");

        int valor1=0; 
        int valor2=1;
        int ciclos=10;
        int suma;

        for(int x=1; x<=ciclos; x++)
        {
            System.out.println(valor1);
            suma=valor1+valor2;
            valor1=valor2;
            valor2=suma;
        }

        
    }
}
