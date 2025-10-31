import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Dime cuantos numeros de la serie fibonacci quieres: ");
        int n = sc.nextInt();

        int primero = 0;
        int segundo = 1;

        System.out.println("Serie Fibonacci con " + n + " términos:");

        for (int i = 1; i <= n; i++) {
            System.out.print(primero + " ");
            int siguiente = primero + segundo;
            primero = segundo;
            segundo = siguiente;
        }
    }
}
