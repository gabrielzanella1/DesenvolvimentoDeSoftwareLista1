public class Exercicio05 {

    public static void executar(){
        
        double A = Prompt.lerDecimal("Digite o primeiro número:");
        double B = Prompt.lerDecimal("Digite o segundo número:");

        double C = A;
        A = B;
        B = C;

        Prompt.imprimir("O valor original de A e B é respectivamente: " + C + " " + A);
        Prompt.imprimir("O valor trocado de A e B é respectivamente: " + A + " " + B);
        
    }
}
