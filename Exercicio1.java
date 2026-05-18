import java.util.Scanner;
public class Exercicio1 {
    public static void main(String[] args) throws Exception {
      double consumo;
      double media;
      double maior = 0;
      double total = 0;
      double leitura = 0;
      Scanner entrada = new Scanner(System.in);
      do{
        System.out.println("digite o consumo: ");
        consumo = entrada.nextDouble();
        total += consumo ;
        leitura++;
        if (consumo > maior) {
          maior = consumo;
        }
      }while(consumo >= 0);
        media = total/leitura;
        System.out.println("o consumo total foi: "+total);
        System.out.println("o maior valor foi: "+maior);
        System.out.println("A media foi: "+media);
        if (media>500) {
          System.out.println("Atenção consumo alto");
        }
        else{
        System.out.println("Consumo adequado");
        }
    entrada.close();
    }
}
