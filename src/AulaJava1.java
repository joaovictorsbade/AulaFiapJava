import java.util.Scanner;

public class AulaJava1 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um texto: ");

        String texto = scanner.nextLine();

        System.out.println("Você digitou: " + texto);

        scanner.close();

    }
}
