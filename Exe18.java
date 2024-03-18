// Exe18.java
// 18. Elabore um algoritmo que receba três notas de um aluno e retorne a sua média 
// harmônica.  
// Média harmônica = 
//         3 
// 1   +    1 +   1 
// nota1 nota2 nota3  
 
// Exemplo: nota1 = 10, nota2 = 5.5, nota3 = 8 
// Média: 7.37

public class Exe18 {
    public static void executar(){
        int cont = 3;
        float[] notas = new float[cont];
        float media = 0; 
        for(int i = 0;i<cont;i++){
            Tools.println("Digite a nota " + (i+1) + " e seu peso");
            notas[i]=Tools.scanffloat();
            media += 1/notas[i];
        }
        Tools.printFormat("A media foi: %.2f\n", (cont/media));
    }
}
