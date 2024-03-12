public class Exercicio20 {

    public static void executar(){

        double tempo = Prompt.lerDecimal("Digite o tempo em horas: ");
        double velMedia = Prompt.lerDecimal("Digite a velocidade média: ");

        double distancia = velMedia * tempo;

        double consumo = distancia / 12;

        Prompt.imprimir("A quantidade de combustível gasta foi de: " + consumo + " litro(s).");

    }
}   
