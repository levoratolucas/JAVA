// 4. Escreva um algoritmo que leia dois números e ao final mostre a soma, subtração,multiplicação e a divisão dos números lidos.

public class Exe4 {
    public static void executar(){
        int cont = 2;
        float  soma = 0, subtracao = 0 , multiplicacao = 1, divisao = 1;
        float[] nums = new float[cont];

        for (int i = 0; i < cont; i++ ) {
            nums[i]= Tools.scanffloat();            
            Tools.println("este é "+ nums[i]);   
            soma += nums[i];        
        } 
        Tools.printFormat("soma é %.2f%n", soma);
        
    }
}
