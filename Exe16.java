// Exe16.java
// 16. Elabore um algoritmo que receba três notas de um aluno e retorne a sua média 
// aritmética. Exemplo: nota1 = 10.0, nota2 = 5.5, nota3 = 8.0. Média: 7.83

public class Exe16 {
    public static void executar(){
        float[] notas = new float[3];
        float media = 0; 
        for(int i = 0;i<3;i++){
            Tools.println("Digite a nota " + (i+1));
            notas[i]=Tools.scanffloat();
            media += notas[i];
        }
        Tools.printFormat("A media foi: %.2f", (media / 3));
    }
    
}
