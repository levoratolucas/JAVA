// Exe6.java
// 6.  Ler  uma  temperatura  em  graus  Celsius  e  apresentá-la  convertida  em  graus 
// Fahrenheit. A fórmula de conversão é:  
 
// F = (9 * C + 160) / 5

public class Exe6 {
    public static void executar(){
        float celcius=Tools.scanffloat();
        Tools.printFormat("Graus Fahrenheit %.2f%n",(9*celcius+160)/5);
    }
    
}
