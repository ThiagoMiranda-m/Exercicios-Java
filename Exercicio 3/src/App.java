import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);

        int A, B;

        System.out.println("Insira dois numeros: ");
        A = scan.nextInt();
        B = scan.nextInt();

        int C = A + B;

        System.out.println("X = " + C);
    }
}
