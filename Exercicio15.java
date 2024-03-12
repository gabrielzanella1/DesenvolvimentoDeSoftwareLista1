public class Exercicio15 {

    public static void executar(){

        double p1x1 = Prompt.lerDecimal("Digite o primeiro valor: ");
        double p1y1 = Prompt.lerDecimal("Digite o segundo valor: ");
        double p2x2 = Prompt.lerDecimal("Digite o terceiro valor: ");
        double p2y2 = Prompt.lerDecimal("Digite o quarto valor: ");

        double d = Math.sqrt(((p2x2 - p1x1) * (p2x2 - p1x1)) + ((p2y2 - p1y1) * (p2y2 - p1y1)));

        Prompt.imprimir("O resultado é: " + d);
    }
}
