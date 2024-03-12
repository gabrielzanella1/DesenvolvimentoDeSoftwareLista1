public class Exercicio04 {

    public static void executar(){
        double A = Prompt.lerDecimal("Digite o primeiro número:");
        double B = Prompt.lerDecimal("Digite o segundo número:");

        double soma = A + B;
        double subtracao = A - B;
        double multiplicacao = A * B;
        double divisao = A / B;

        Prompt.imprimir("A soma dos números é: " + soma) ;
        Prompt.imprimir("A subtração dos números é: " + subtracao);
        Prompt.imprimir("A multiplicação dos números é: " + multiplicacao);
        Prompt.imprimir("A divisão dos números é: " + divisao);

    }
}
