public class Exercicio03 {
    
    public static void executar(){

        int A = Prompt.lerInteiro("Informe o primeiro número:");
        int B = Prompt.lerInteiro("Informe o segundo número:");

        if(A > B)
        {
            Prompt.imprimir("O número A é maior!");
        } else if (A == B)
        {
            Prompt.imprimir("Sequência inválida.");
        } 
        else 
        {
            Prompt.imprimir("O número B é maior!");
        }
    }
}
