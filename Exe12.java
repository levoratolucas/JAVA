// exe12.java
// 12.  Escreva  um  algoritmo  que  receba  o  número  do  mês  e  mostre  o  mês 
// correspondente. Valide mês inválido. 

public class Exe12 {
   public static void executar(){
    Tools.println("12.  Escreva  um  algoritmo  que  receba  o  número  do  mês  e  mostre  o  mês correspondente. Valide mês inválido");
    int num =Tools.scanfInt();
    String msg;
    Tools.println("digite um numero inteiro entre 1 e 12");
    switch (num) {
        case 1:
        msg ="janeiro";
            break;
        case 2:
        msg ="fevereiro";
            break;
        case 3:
        msg ="março";
            break;
        case 4:
        msg ="abril";
            break;
        case 5:
        msg ="maio";
            break;        
        case 6:
        msg ="junho";
            break;        
        case 7:
        msg ="julho";
            break;        
        case 8:
        msg ="agosto";
            break;        
        case 9:
        msg ="setembro";
            break;        
        case 10:
        msg ="outubro";
            break;        
        case 11:
        msg ="novembro";
            break;        
        case 12:
        msg ="dezembro";
            break;        
        default:
        msg ="Número inválido!";
            break;
    }
    Tools.println(msg);
   }
}
