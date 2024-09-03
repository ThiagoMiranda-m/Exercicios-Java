//A fórmula para calcular a área de uma circunferência é: area = π . raio2. Considerando para este problema que π = 3.14159:

import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Insira o valor do raio: ");
        double raio = scan.nextDouble();
        double area = 3.14159 * (raio * raio);
        
        System.out.printf("A=%.4f\n", area);

    }
}