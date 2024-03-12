public class Exercicio14 {

    public static void executar(){
        
        double a1 = Prompt.lerDecimal("Digite o primeiro termo: ");
        double n = Prompt.lerDecimal("Digite o n-ésimo termo: ");
        double r = Prompt.lerDecimal("Digite o a razão: ");

        double an = a1 + (n - 1) * r;   

        Prompt.imprimir("O resultado da progressão aritmética é: " + an);

    }
}   
