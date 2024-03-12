public class Exercicio06 {

    public static void executar(){
            
        double graus = Prompt.lerDecimal("Digite a temperatura em celsius:");

        double conversao = (9 * graus + 160) / 5;

        Prompt.imprimir("A temperatura em Farenheit é: " + conversao);

    }
}
