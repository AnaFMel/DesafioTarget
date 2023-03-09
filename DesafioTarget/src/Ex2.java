import java.util.ArrayList;
import java.util.Scanner;

public class Ex2 {
    public static void main(String[] args) {
        int elemento = 0;
        int num = 0;
        ArrayList<Integer> fibonacci = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        System.out.println("Insira um número: ");
        num = Integer.parseInt(sc.nextLine());
        for (int j = 0; elemento <= num; j++) {
            if (j < 2) {
                fibonacci.add(j, j);
            } else {
                elemento = fibonacci.get(j - 1) + fibonacci.get(j - 2);
                fibonacci.add(j, elemento);
            }
        }
        if (fibonacci.contains(num)) {
            System.out.println("Número inserido pertence à sequência de Fibonacci!");
        } else {
            System.out.println("Número inserido não pertence à sequência de Fibonacci!");
        }
    }

}
