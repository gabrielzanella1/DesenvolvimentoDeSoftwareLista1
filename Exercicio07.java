public class Exercicio07 {

    public static void executar(){

        int numero = Prompt.lerInteiro("Informe o número:");

        if(numero > 99 && numero < 201) {
            Prompt.imprimir("O número está entre 100 e 200");
        } else {
            Prompt.imprimir("O número não está entre 100 e 200");
        }
    }
}
