import java.util.Scanner;

public class App {

    public static void main(String[] args) {

        Scanner user = new Scanner(System.in);
        System.out.println("Digite um número: ");
        int n1 = user.nextInt();
        System.out.println("Tabela de multiplicação de" + " " + n1);

        for(int i = 0; i <= 10; i++){
            System.out.println(n1 + " x " + i + " = " + n1 * i);
        }
    }
}
