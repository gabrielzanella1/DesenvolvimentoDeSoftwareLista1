public class Exercicio18 {

    public static void executar(){ 

        double nota1 = Prompt.lerDecimal("Digite a primeira nota: ");
        double nota2 = Prompt.lerDecimal("Digite a segunda nota: ");
        double nota3 = Prompt.lerDecimal("Digite a terceira nota: ");

        double media = 3 / ((1 / nota1) + (1 / nota2) + (1 / nota3));

        Prompt.imprimir("A média harmônica é: " + media);

    }
}
