// Escreva um algoritmo que leia três valores inteiros distintos e escreva-os emordem crescente

public class Exe11 {
    public static void executar() {
        int cont = 3;
        int[] num = new int[cont];

        for (int i = 0; i < cont; i++) {
            Tools.println("Escreva o numero" + (i + 1));
            num[i] = Tools.scanfInt();
        }
        int maior = num[0];
        int menor = num[0];
        for (int i = 0; i < cont; i++) {
            if (maior <= num[i]) {
                maior = num[i];
            }
            if (menor >= num[i]) {
                menor = num[i];
            }
        }
        num[1] = (num[0] + num[1] + num[2]) - (maior + menor);
        num[0] = menor;
        num[2] = maior;
        Tools.println("A sequencia é :");
        for (int i = 0; i < cont; i++) {
            Tools.printInt(num[i]);
            

        }
    }

}
