// Exe15.java
// 15. Tendo como dados de entrada dois pontos quaisquer no plano, P1(x1, y1) e P2(x2, 
// y2), calcule e retorne a distância entre eles. A fórmula que efetua tal cálculo é: d = raiz 
// (((x2 - x1)2) + ((y2 - y1)2)). Exemplo: p1(0, 5), p2(10, 20). Distancia: 18,03

public class Exe15 {
    public static void executar(){
        int[] p1 = new int[2] , p2 = new int[2]; 
        Tools.println("digite o x de P1(x,y)");
        p1[0] = Tools.scanfInt();
        Tools.println("digite o y de P1(x,y)");
        p1[1] = Tools.scanfInt();
        Tools.println("digite o x de P2(x,y)");
        p2[0] = Tools.scanfInt();
        Tools.println("digite o y de P2(x,y)");
        p2[1] = Tools.scanfInt();
        float resultado = ((p2[0] - p1[0])*(p2[0] - p1[0])) + ((p2[1] - p1[1])*(p2[1] - p1[1])) ;
        Tools.printFormat("Distancia %.2f\n",Math.sqrt(resultado));
    }
}
