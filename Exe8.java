// Exe8.java
// 8. Escreva um algoritmo que leia um número e mostre uma mensagem caso este 
// número seja maior ou igual a 50, outra se ele for menor que 50. 

public class Exe8 {
    public static void executar(){
        int num=Tools.scanfInt();
        String msg ="Seu numero é %d e é menor que 50\n";
        if(num >= 50){
            msg = "Seu numero é %d e entrou na quinta casa decimal\n";
        }
        Tools.printFormat(msg,num);
    }
}
