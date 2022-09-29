import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        double num, num2, soma;
        System.out.println("Digite um número: ");
        num = sc.nextInt();
        System.out.println("Digite outro número: ");
        num2 = sc.nextInt();
        sc.close();
        soma = num + num2;
        System.out.println("A soma dos dois números é " + soma);
    }
}
