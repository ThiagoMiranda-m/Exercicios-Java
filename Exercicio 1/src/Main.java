import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Insira o valor do raio: ");
        double raio = scan.nextDouble();
        double area = 3.14159 * (raio * raio);
        
        System.out.printf("%.4f", area);

    }
}