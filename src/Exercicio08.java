import java.util.Scanner;

public class Exercicio08 {
    public static void main(String[] args) {

        // declarando variaveis
        Scanner sc = new Scanner(System.in);
        int valor, valorDezena;

        // entrada de dados
        System.out.println("Digite um valor com três digitos (100 - 999) --> ");
        valor = sc.nextInt();

        // processamento de dados
        valorDezena = valor % 100 / 10;

        // saída de dados
        System.out.println("Valor da Dezena --> " + valorDezena);

    }
}