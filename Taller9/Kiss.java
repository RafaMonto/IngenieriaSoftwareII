import java.util.Arrays;
public class Kiss {
    public static void main(String[] args) {
        String cadena = "Hola Mundo";
        int[] numeros = {1,2,10,41,16,87,99}; 
        String cadenaInvertida = invertirCadena(cadena);
        int numMayor = numeroMayor(numeros);
        System.out.println("La cadena invertida es: "+cadenaInvertida);
        System.out.println("El numero mayor es: "+numMayor);
    }

    public static String invertirCadena(String palabra){
        return new StringBuilder(palabra).reverse().toString();
    }

    public static int numeroMayor(int[] num){
        return Arrays.stream(num).max().getAsInt();
    }
}
