// 2. Escreva um algoritmo que leia dois números digitados pelo usuário e exiba oresultado da sua soma

public class Exe02 {
    public static void executar(){

        int[] num = new int[2];

        Tools.println("DIGITE O PRIMEIRO NÚMERO");
        num[0]=Tools.scanfInt();
        Tools.println("DIGITE O SEGUNDO NÚMERO");
        num[1]=Tools.scanfInt();

        Tools.println("A soma dos números é: " + (num[0] + num[1]));        
    }


}
