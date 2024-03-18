// Exe17.java
// 17. Elabore um algoritmo que receba três notas de um aluno os pesos referentes a 
// cada nota e retorne a sua média ponderada. Veja o cálculo da média ponderada: 
// Média ponderada = nota1 * peso1 + nota2 * peso2 + nota3 * peso3 
// peso1 + peso2 + peso3 
 
// Exemplo: nota1 = 10, nota2 = 5.5, nota3 = 8, peso1 = 5, peso2 = 3, peso3 = 2 
// Média ponderada = 8.25

public class Exe17 {
    public static void executar(){
        int cont = 3;
        float[] notas = new float[cont],pesos = new float[cont];
        float media = 0; 
        for(int i = 0;i<cont;i++){
            Tools.println("Digite a nota " + (i+1) + " e seu peso");
            notas[i]=Tools.scanffloat();
            pesos[i]=Tools.scanffloat()/10;
            media += notas[i]*pesos[i];
        }
        Tools.printFormat("A media foi: %.2f\n", (media));
    }
}
