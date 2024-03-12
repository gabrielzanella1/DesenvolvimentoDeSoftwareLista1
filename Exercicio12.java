public class Exercicio12 {

    public static void executar(){

        int numero = Prompt.lerInteiro("Digite o número do mês: ");

        if(numero == 1){
            Prompt.imprimir("Janeiro.");
        } else if(numero == 2){
            Prompt.imprimir("Fevereiro.");
        } else if(numero == 3){
            Prompt.imprimir("Março.");
        } else if(numero == 4){
            Prompt.imprimir("Abril.");
        } else if(numero == 5){
            Prompt.imprimir("Maio.");
        } else if(numero == 6){
            Prompt.imprimir("Junho.");
        } else if(numero == 7){
            Prompt.imprimir("Julho.");
        } else if(numero == 8){
                Prompt.imprimir("Agosto.");
        } else if(numero == 9){
            Prompt.imprimir("Setembro.");
        } else if(numero == 10){
                Prompt.imprimir("Outubro.");
        } else if(numero == 11){
            Prompt.imprimir("Novembro.");
        } else if(numero == 12){
            Prompt.imprimir("Dezembro.");
        } else {
            Prompt.imprimir("Mês inválido.");
        }
    }
}
