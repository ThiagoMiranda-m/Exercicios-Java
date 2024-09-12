import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);

        String nome = scan.next();
        double salario = scan.nextDouble();
        double vendas = scan.nextDouble();

        double total = salario + ((15 *vendas) / 100);
        System.out.printf("TOTAL = R$ %.2f\n", total);
    }
}
