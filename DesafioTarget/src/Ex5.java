import java.lang.reflect.Array;
import java.util.Scanner;

public class Ex5 {
    public static void main(String[] args) {
        String original;
        String invertido;
        int j = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Insira uma palavra ou frase: ");
        original = sc.nextLine();
        char[] letras = new char[original.length()];
        char[] letrasInvertidas = new char[original.length()];
        letras = original.toCharArray();
        for (int i = (original.length() - 1); i >= 0; i--) {
            letrasInvertidas[j] = letras[i];
            j++;
        }

        System.out.println("Frase/palavra invertida:");
        System.out.println(letrasInvertidas);
    }
}
