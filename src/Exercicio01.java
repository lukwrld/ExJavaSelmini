import java.util.Scanner;

public class Exercicio01 {
    public static void main(String[] args) {

        // declarando variaveis
        Scanner sc = new Scanner(System.in);
        String nome;
        double base, altura;
        double area, perimetro;

        // entrada de dados
        System.out.println("Digite seu nome: ");
        nome = sc.nextLine();

        System.out.println("Digite o valor da base: ");
        base = sc.nextDouble();

        System.out.println("Digite o valor da altura: ");
        altura = sc.nextDouble();

        // processamento de dados
        area = altura * base;
        perimetro = 2 * (base + altura);

        // saída de dados
        System.out.println("################################################");
        System.out.println("Olá, " + nome);
        System.out.println("Área --> " + area);
        System.out.println("Perímetro --> " + perimetro);
        System.out.println("################################################");

    }
}
