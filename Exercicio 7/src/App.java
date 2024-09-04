import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
       Scanner scan = new Scanner(System.in);
       
       double notaA = scan.nextDouble();
       double notaB = scan.nextDouble();
       double notaC = scan.nextDouble();

       double media = (((2*notaA) + (3*notaB) + (5*notaC))/10);

       System.out.printf("MEDIA = %.1f\n", media);
    }
}
