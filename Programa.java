// teste
import java.lang.reflect.Method;

public class Programa {
    public static void main(String[] args) {
        int num = 20;

        String restart = "S";

        while (restart.equals("S")) {
            Tools.println("Digite um numero dos exercicios entre 1 e 20");
            int opc = Tools.scanfInt();
            boolean opcCase = true;
            if (opc < 0 || opc > num) {
                opcCase = false;
                Tools.println("Deseja continuar? S-N");
                restart = Tools.scanfStr().toUpperCase();
                break;
            }
            if (opcCase) {
                try {// trata esse trecho como execão , não sei como é (preciso perguntar ao
                     // professor)
                    String exercicio = "Exe" + opc; // da nome a classe
                    Class<?> classe = Class.forName(exercicio); // busca a classe por nome
                    Method method = classe.getDeclaredMethod("executar"); // busca o metodo na classe que dei o nome
                                                                          // acima
                    Object exer = classe.newInstance();// chama a classe
                    method.invoke(exer); // executa a função / metodo criado pela classe
                } catch (Exception teste) {
                    teste.printStackTrace();// sem isso não faz acontecer
                }
                Tools.println("Deseja continuar? S-N");
                restart = Tools.scanfStr().toUpperCase();
            }
        }
    }
}
