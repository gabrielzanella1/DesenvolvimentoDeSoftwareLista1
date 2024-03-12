public class Exercicio10 {

    public static void executar(){

        int numero = Prompt.lerInteiro("Digite o número: ");

        if(numero == 1){
            Prompt.imprimir("Número um.");
        } else if(numero == 2){
            Prompt.imprimir("Número dois.");
        } else if(numero == 3){
            Prompt.imprimir("Número três.");
        } else if(numero == 4){
            Prompt.imprimir("Número quatro.");
        } else if(numero == 5){
            Prompt.imprimir("Número cinco.");
        }else {
            Prompt.imprimir("Número inválido!");
        }
    }
}
