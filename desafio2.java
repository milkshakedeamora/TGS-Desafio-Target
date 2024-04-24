import java.util.Scanner;

public class desafio2 {
    static boolean pertenceFibonacci(String valor) {
        int n = Integer.parseInt(valor);
        int a = 0, b = 1;
        while (b < n) {
            int temp = b;
            b = a + b;
            a = temp;
        }

        return (b == n);

    }

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        System.out.println("Digite um valor:");
        String valor = ler.next();
        System.out.println(valor + (pertenceFibonacci(valor) ? "" : " não") + " pertence à sequência de Fibonacci");

        

    }
}