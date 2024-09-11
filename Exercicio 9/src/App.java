import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);

        int num = scan.nextInt();
        int horas = scan.nextInt();
        double salhor = scan.nextDouble();

        double salario = horas * salhor;

        System.out.println("NUMBER = " + num);
        System.out.printf("SALARY = U$ %.2f\n", salario);

    }
}
