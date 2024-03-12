public class Exercicio13 {
    
    public static void executar(){

        double A = Prompt.lerDecimal("Digite o primeiro número: ");
        double B = Prompt.lerDecimal("Digite o segundo número: ");
        char X = Prompt.lerLinha("Informe o operador (+, -, *, /): ").charAt(0);
        
        if(X == '+'){
            Prompt.imprimir("A soma é: " + (A + B));
        } else if(X == '-'){
            Prompt.imprimir("A subtração é: " + (A - B));
        } else if(X == '*'){
            Prompt.imprimir("A multiplicação é: " + (A * B));
        } else if(X == '/'){

            if(A == 0){
                Prompt.imprimir("Divisão por zero inválida.");
            }else if (B == 0){
                Prompt.imprimir("Divisão por zero inválida.");
            }else {
                Prompt.imprimir("A divisão é: " + (A / B));
            }

        }else {
            Prompt.imprimir("Operador inválido.");
        }
    }
}   
