// Exe19.java
// 19. Faça um algoritmo que receba o raio e a altura de um cilindro e retorne o seu 
// volume calculado de acordo com a seguinte fórmula: volume = 3.14 * raio2 * altura; 
// Exemplo: raio = 10, altura = 15. Volume = 4710

public class Exe19 {
    public static void executar(){
        double raio,altura,volume;
        Tools.println("Qual o raio do cilindro?");
        raio = Tools.scanffloat();
        Tools.println("Qual a altura do cilindro?");
        altura = Tools.scanffloat();
        volume = 3.14 * (Math.pow(raio,2)) * altura;
        Tools.printFormat("O volume é %.2f\n",volume);
    }
}
