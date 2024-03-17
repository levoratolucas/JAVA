// Exe7.java
// 7. Escreva um algoritmo que leia um número e diga, através de uma mensagem, se 
// este número está no intervalo entre 100 e 200. Caso o número esteja fora do intervalo 
// o usuário também deverá ser informado

public class Exe7 {
    public static void executar(){
        int num=Tools.scanfInt();
        String msg ="Seu numero esta fora do intervalo de 100 e 200";
        if(num >= 100 && num <= 200){
            msg = "Seu número está no intervalo entre 100 e 200";
        }
        Tools.println(msg);
    }
}
