// Exe10.java
// 10. Escreva um algoritmo que leia um número de 1 a 5 e escreva-o por extenso. Caso 
// o usuário digite um valor que não esteja neste intervalo, exibir a mensagem: “Número 
// inválido!”.

public class Exe10 {
    public static void executar(){
        int num =Tools.scanfInt();
        String msg;

        switch (num) {
            case 1:
            msg ="UM";
                break;
            case 2:
            msg ="DOIS";
                break;
            case 3:
            msg ="TRÊS";
                break;
            case 4:
            msg ="QUATRO";
                break;
            case 5:
            msg ="CINCO";
                break;        
            default:
            msg ="Número inválido!";
                break;
        }
        Tools.println(msg);
    }
}
