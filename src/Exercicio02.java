import java.util.Scanner;

public class Exercicio02 {
    public static void main(String[] args) {

        // declarando variáveis
        Scanner sc = new Scanner(System.in);
        double graus;
        double fahrenheit;

        // entrada de dados
        System.out.println("Qual a temperatura de hoje? ");
        graus = sc.nextDouble();

        //processamento de dados
        fahrenheit = graus * 9 / 5 + 32;

        // saída de dados
        System.out.println("#################################################################");
        System.out.println("A temperatura em Graus Celsius é de " + graus + "°C");
        System.out.println("A temperatura em Graus Fahrenheit é de " + fahrenheit + "°F");
        System.out.println("#################################################################");

    }
}
