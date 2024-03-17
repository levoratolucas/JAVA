// Exe5.java
// 5. Leia valores nas variáveis A e B, e efetue a troca dos valores de forma que o valor 
// da variável A passe a ser o valor da variável B e o valor da variável B passe a ser o 
// valor da variável A. Apresentar uma mensagem com o valor original de cada variável 
// e outra com os valores trocados. 
public class Exe5 {
    public static void executar(){
        String a =Tools.scanfStr();
        String b =Tools.scanfStr();
        String c = a;
        a = b;
        b=c;
    Tools.println(a + "--"+ b);
    }
}
