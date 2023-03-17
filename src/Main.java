import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Random rand = new Random();

        System.out.print("Podaj liczbę n: ");
        int n = input.nextInt();

        int suma = 0;
        for (int i = 0; i < n; i++) {
            int liczba = rand.nextInt(56) - 10;
            if (liczba % 2 == 0) {
                suma += liczba;
            }
        }

        System.out.println("Suma liczb parzystych wynosi: " + suma);
    }
}
