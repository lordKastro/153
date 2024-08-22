import java.util.Scanner;

public class ativi {
public static void main(String[] args) {
    @SuppressWarnings("resource")
    Scanner leia = new Scanner(System.in);
    int numero = leia.nextInt();
    System.out.println("Digite um numero de 1  5 ");
    switch (numero){
        case 1:
        System.out.println("Numero 1 foi digitado...");
        break;
        case 2:
        System.out.println("Numero 2 foi digitado...");
        break;
        case 3:
        System.out.println("Numero 3 foi digitado...");
        break;
        case 4:
         System.out.println("Numero 4 foi digitado...");
        break;
        case 5:
        System.out.println("Numero 5 foi digitado...");

        default:
        System.out.println("Numero invalido");
//
    }



}
}