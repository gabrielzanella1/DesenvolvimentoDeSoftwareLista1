public class Exercicio08 {

    public static void executar(){

        int numero = Prompt.lerInteiro("Informe o número: ");

        if(numero >= 50) {
            Prompt.imprimir("O número é maior ou igual a 50.");
        } else {
            Prompt.imprimir("O número é menor que 50.");
        }
    }
}
