import java.util.Scanner;

public class Tools {

    public static void println(String msg){
        System.out.println(msg);
    }
    
    public static int scanfInt() {
        Scanner scanner = new Scanner(System.in);
        return scanner.nextInt();
    }
    public static String scanfStr() {
        Scanner scanner = new Scanner(System.in);
        return scanner.next();
    }

    public static void printInt(int msg){
        System.out.println(msg);
    }
}