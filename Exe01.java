// Escreva um algoritmo que leia um número digitado pelo usuário e 
// mostre amensagem “Número maior do que 10!”, caso este número seja 
// maior, ou “Númeromenor ou igual a 10!”, caso este número seja menor ou igual.


public class Exe01 {
    public static void executar(){
        
        int num ;
        String msg = "Número menor ou igual a 10!";
        Tools.println("Digite um número");
        num = Tools.scanfInt();

        if(num > 10){
            msg = "Número maior do que 10!";
        }
        Tools.println(msg);
    }    
}
