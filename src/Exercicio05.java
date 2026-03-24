import java.util.Scanner;

public class Exercicio05 {
    public static void main(String[] args) {

        // declarando variáveis
        Scanner sc = new Scanner(System.in);
        double valorAula, porcentagemINSS,
                salarioBruto, salarioLiquido, valorDesconto;
        int horasTrab;

        // entrada de dados
        System.out.println("Qual o valor da hora-aula --> R$ ");
        valorAula = sc.nextDouble();

        System.out.println("Quantas horas você trabalhou --> ");
        horasTrab = sc.nextInt();

        System.out.println("Quanto é o descontdo do INSS --> ");
        porcentagemINSS = sc.nextDouble();

        // processamento de dados
        salarioBruto = valorAula * horasTrab;
        valorDesconto = salarioBruto * porcentagemINSS / 100;
        salarioLiquido = salarioBruto - valorDesconto;

        // saída de dados
        System.out.println("Salário Líquido --> R$" +
                String.format("%.2f", salarioLiquido));

    }
}
