import java.util.Scanner;

public class Suma {
    public static void main(String[] args) throws Exception {
       Scanner sc = new Scanner(System.in);
    
    // Pedir al usuario un número
    System.out.print(" Ingresa un número: ");
    int num = sc.nextInt();
    int sum = 0;
    for (int i = 1; i <= num; i++) {
    sum = sum + i;   
}
System.out.println("Sumatoria = " + sum);
    }

}
