// 3. Escreva um algoritmo que leia os valores de dois números inteiros distintos nasvariáveis
//  A e B e informe qual deles é o maior. Caso os números sejam iguais informarao usuário que a sequência de números informados é inválida.

public class Exe3 {
    public static void executar() {        
        Tools.println("DIGITE UM NUMERO INTEIRO");
        int a = Tools.scanfInt();
        Tools.println("DIGITE OUTRO NUMERO INTEIRO");
        int b = Tools.scanfInt();
        String msg = a + "-" + b;
        if(a>b){
            int c = a;
            a = b;
            b = c;
            msg = a + "-" + b;
        }
        else if(a == b){
            msg = "sequência de números informados é inválida";
        }
        Tools.println(msg);
    }
}
