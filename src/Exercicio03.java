import java.util.Scanner;

public class Exercicio03 {
    public static void main(String[] args) {

        // declaração de variáveis
        Scanner sc = new Scanner(System.in);
        double veloMedia, litrosGastos, distancia;
        int horas;

        // entrada de dados
        System.out.println("Quantas horas você fez de viagem? ");
        horas = sc.nextInt();

        System.out.println("Qual foi a velocidade média? ");
        veloMedia = sc.nextDouble();

        // processamento de dados
        distancia = veloMedia * horas;
        litrosGastos = distancia * 10.5;

        // saída de dados
        System.out.println("Você gastou " + litrosGastos + " litros de combustível nessa viagem");

    }
}
