// Exe9.java
// 9. Leia dois números nas variáveis A e B e identifique se os valores são iguais ou 
// diferentes. Caso eles sejam iguais imprima uma mensagem dizendo que são iguais. 
// Caso sejam diferentes, informe que são diferentes e qual número é o maior

public class Exe9 {
    public static void executar() {
        float a, b,c;
        Tools.println("Digite o primeiro numero");
        a = Tools.scanffloat();
        Tools.println("Digite o segundo numero");
        b = Tools.scanffloat();
        if (a == b) {
            Tools.println("são iguais.");
            return;
        }
        
        if (a < b) {
            c=a;
            a=b;
            b=c;
        }
        Tools.printFormat("são diferentes. maior é %.2f menor é %.2f\n",a,b);

    }

}
