// Exe13.java
// 13. Escreva um algoritmo que leia valores REAIS nas variáveis A e B e o tipo de 
// operador em outra variável do tipo CARACTERE. Imprima o resultado da operação 


public class Exe13 {
    public static void executar(){
        Tools.println("\n\n\n13. Escreva um algoritmo que leia valores REAIS nas variáveis A e B e o tipo de operador em outra variável do tipo CARACTERE. Imprima o resultado da operação\n\n\n");
        Tools.println("digite o primeiro numero");
        float a = Tools.scanffloat();
        Tools.println("digite o segundo numero");
        float b = Tools.scanffloat();
        Tools.println("digite o operador");
        String op = Tools.scanfStr(),msg;

        switch (op) {
            case "+":
            msg = ("Soma entre "+a+" e "+b+" = "+(a+b));
                break;
            case "-":
            msg = ("subtracao entre "+a+" e "+b+" = "+(a-b));
                break;
            case "*":
            msg = ("multiplicacao entre "+a+" e "+b+" = "+(a*b));
                break;
            case "/":
            msg = ("divisao entre "+a+" e "+b+" = "+(a/b));
                break;
            case "%":
            msg = ("resto entre "+a+" e "+b+" = "+(a%b));
                break;
        
            default:
             msg = "digite valores validos";
                break;
        }
        Tools.println(msg);
    }
    
}
