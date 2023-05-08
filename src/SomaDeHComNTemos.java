import java.util.Scanner;

public class SomaDeHComNTemos {
    public static void main(String[] Args) {

        double h = 0;
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite um valor: ");
        double n = sc.nextDouble();

        for (int i = 1; i <= n; i++) {

            h = h + (1.0 / i);
        }
       System.out.println(Math.round(h));//Math.round(h) torna o valor de h inteiro

    }
}