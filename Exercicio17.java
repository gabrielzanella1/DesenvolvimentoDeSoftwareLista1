public class Exercicio17 {

    public static void executar(){ 

        double nota1 = Prompt.lerDecimal("Digite a primeira nota: ");
        double nota2 = Prompt.lerDecimal("Digite a segunda nota: ");
        double nota3 = Prompt.lerDecimal("Digite a terceira nota: ");

        double peso1 = Prompt.lerDecimal("Digite o primeiro peso: ");
        double peso2 = Prompt.lerDecimal("Digite o segundo peso: ");
        double peso3 = Prompt.lerDecimal("Digite o terceiro peso: ");

        double media = ((nota1 * peso1) + (nota2 * peso2) + (nota3 * peso3)) / (peso1 + peso2 + peso3);

        Prompt.imprimir("A média ponderada é: " + media);

    }
}
