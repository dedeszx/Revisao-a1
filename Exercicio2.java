import java.util.Scanner;
public class Exercicio2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double peso;
        int regiao;
        double valorFrete;
        double totalArrecadado = 0;
        for (int i = 1; i <= 10; i++) {
            System.out.println("Pacote " + i);
            System.out.print("Digite o peso do pacote (kg): ");
            peso = sc.nextDouble();
            System.out.print("Digite o código da região (1-Norte, 2-Sul, 3-Outras): ");
            regiao = sc.nextInt();
            if (regiao == 1) {
                valorFrete = peso * 15;
            } else if (regiao == 2) {
                valorFrete = peso * 10;
            } else {
                valorFrete = peso * 12;
            }
            if(regiao > 3 || regiao < 1){
                break;
            }
            if (peso > 30) {
                valorFrete = valorFrete + (valorFrete * 0.20);
            }
            System.out.println("Valor do frete: R$ " + valorFrete);
            totalArrecadado += valorFrete;
        }
        System.out.println("Valor total arrecadado com os fretes: R$ " + totalArrecadado);
        sc.close();
    }
}