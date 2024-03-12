public class Exercicio09 {

    public static void executar(){

        int A = Prompt.lerInteiro("Informe o primeiro número:");
        int B = Prompt.lerInteiro("Informe o segundo número:");

        if(A == B)
        {
            Prompt.imprimir("Os números são iguais!");
        }else
        {
            Prompt.imprimir("Os números não são iguais!");
        }
    }
}
