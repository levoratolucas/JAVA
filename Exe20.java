// Exe20.java
// 20. Elabore um algoritmo que calcule a quantidade de litros de combustível gasta em 
// uma viagem, utilizando um automóvel que faz 12km por litro e considerando que são 
// fornecidos o tempo em hora e a velocidade média da viagem. 
public class Exe20 {
    public static void executar() {
        Tools.println("vamos calcular a autonomia de seu veiculo");
        Tools.println("quanta horas está dirigindo?");
        int tempo = Tools.scanfInt();
        Tools.println("Qual sua VM(Velocidade media)?");
        int vm = Tools.scanfInt();
        Tools.println("Seu carro gastou " + ((tempo + vm) / 12));
    }
}
