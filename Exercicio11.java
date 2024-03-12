public class Exercicio11 {

    public static void executar(){

        int numero1 = Prompt.lerInteiro("Digite o primeiro número: ");
        int numero2 = Prompt.lerInteiro("Digite o segundo número: ");
        int numero3 = Prompt.lerInteiro("Digite o terceiro número: ");

        if (numero1 < numero2 && numero1 < numero3) {
            if (numero2 < numero3) {
                Prompt.imprimir(numero1 + ", " + numero2 + ", " + numero3);
            } else {
                Prompt.imprimir(numero1 + ", " + numero3 + ", " + numero2);
            }
        } else if (numero2 < numero1 && numero2 < numero3) {
            if (numero1 < numero3) {
                Prompt.imprimir(numero2 + ", " + numero1 + ", " + numero3);
            } else {
                Prompt.imprimir(numero2 + ", " + numero3 + ", " + numero1);
            }
        } else {
            if (numero1 < numero2) {
                Prompt.imprimir(numero3 + ", " + numero1 + ", " + numero2);
            } else {
                Prompt.imprimir(numero3 + ", " + numero2 + ", " + numero1);
            }
        }
    }
}
