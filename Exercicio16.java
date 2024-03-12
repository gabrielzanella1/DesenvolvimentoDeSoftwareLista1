public class Exercicio16 {

    public static void executar(){

        double a = Prompt.lerDecimal("Digite a primeira nota: ");
        double b = Prompt.lerDecimal("Digite a segunda nota: ");
        double c = Prompt.lerDecimal("Digite a terceira nota: ");

        double media = (a + b + c) / 3;

        Prompt.imprimir("A média é: " + media);

    }
}
