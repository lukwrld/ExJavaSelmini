import java.util.Scanner;

public class Exercicio09 {
    public static void main(String[] args) {

        // declarando variaveis
        Scanner sc = new Scanner(System.in);
        int valor, valorInvertido,
                unidade, dezena, centena;

        // entrada de dados
        System.out.println("Digite um valor com 3 digitos (100 - 999) --> ");
        valor = sc.nextInt();

        // processamento de dados
        unidade = valor % 10;
        dezena = valor / 10 % 10;
        centena = valor / 100;

        valorInvertido = unidade * 100 + dezena * 10 + centena;

        // saida de dados
        System.out.println(unidade + "" + dezena + "" + centena);
        System.out.println("Valor Invertido --> " + valorInvertido);

    }
}
