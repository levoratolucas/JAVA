// Exe14.java
// 14.  A  expressão  an  =  a1  +  (n  –  1)  *  r  é  denominada  termo  geral  da  Progressão 
// Aritmética (PA). Nesta fórmula, temos que an é o termo de ordem n (n-ésimo termo), 
// r é a razão e a1 é o primeiro termo da Progressão Aritmética. Escreva um algoritmo 
// que encontre o n-ésimo termo de uma progressão aritmética. Exemplo: a1 = 10, n = 
// 7, r = 3. Resultado: an = 28

public class Exe14 {
    public static void executar(){
        Tools.println("14.  A  expressão  an  =  a1  +  (n  –  1)  *  r  é  denominada  termo  geral  da  Progressão \n" + //
                        "Aritmética (PA). Nesta fórmula, temos que an é o termo de ordem n (n-ésimo termo), \r\n" + //
                        "r é a razão e a1 é o primeiro termo da Progressão Aritmética. Escreva um algoritmo \r\n" + //
                        "que encontre o n-ésimo termo de uma progressão aritmética. Exemplo: a1 = 10, n = \r\n" + //
                        "7, r = 3. Resultado: an = 28 ");

        Tools.println("Digite A1");
        int a1 = Tools.scanfInt();
        Tools.println("Digite N");
        int n = Tools.scanfInt();
        Tools.println("Digite R");
        int r = Tools.scanfInt();        
        float an = a1 + (n-1)* r;
        Tools.println("resultado: AN = "+ an);
    }


}
